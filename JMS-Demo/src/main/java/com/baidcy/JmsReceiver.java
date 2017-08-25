package com.baidcy;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.*;

import javax.jms.*;
import javax.jms.Message;

/**
 * Created by BaIcy on 2017/7/17.
 */
public class JmsReceiver {

    public static void main(String[] args) {
        try {
            ConnectionFactory connectionFactory =
                    new ActiveMQConnectionFactory("tcp://localhost:61616");

            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);

            Destination destination = new ActiveMQQueue("test.queue");

            MessageConsumer consumer = session.createConsumer(destination);

            TextMessage message = (TextMessage)consumer.receive();

            System.out.println(message.getText());



        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
