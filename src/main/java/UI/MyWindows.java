package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindows {
    public static void main(String[] args) {
        //swing,SWT,JavaFX
        //extension
        JFrame frame=new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //odd Component
        JButton button=new JButton("ok");
        //匿名類別，Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Hello world!");
            }
        });
        //MyActionListener Listener=new MyActionListener();
        //button.addActionListener(Listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Testing"));
        frame.add(new JButton("Testing"));
        frame.setVisible(true);

        System.out.println("END?");
    }
}
