package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame{
    //Fields
    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("Hi");
        JLabel label=new JLabel("HaHaHa");
        JTextField number=new JTextField(8);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);

    }
    //Methods



    public static void main(String[] args) {
        GuessFrame guessFrom=new GuessFrame();

     //   guessFrom.setSize(600,400);
     //   guessFrom.setVisible(true);
    }

}
