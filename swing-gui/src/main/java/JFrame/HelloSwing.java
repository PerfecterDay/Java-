package JFrame;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by BaIcy on 2016/12/21.
 */
public class HelloSwing {

    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Hello Swing.");
        JLabel label = new JLabel("A Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.add(label);
        TimeUnit.SECONDS.sleep(1);
        label.setText("Hey, This is Different!");

    }
}
