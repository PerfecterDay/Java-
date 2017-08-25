package com.baidcy;


import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.*;

/**
 * Hello world!
 *
 */
public class JmsSender {


    public static void main( String[] args ) {

        int a[] = {1,2,3};
        

        try {
            ConnectionFactory connectionFactory =
                    new ActiveMQConnectionFactory("tcp://localhost:61616");

            Connection connection = connectionFactory.createConnection();

            Session session = connection.createSession(false,Session.CLIENT_ACKNOWLEDGE);

            Destination destination = new ActiveMQQueue("test.queue");

            TextMessage message = session.createTextMessage();
            message.setText("Hello JMS.");


            MessageProducer producer = session.createProducer(destination);
            producer.send(message);
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
