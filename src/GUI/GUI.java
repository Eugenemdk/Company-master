package GUI;

import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

public class GUI extends JFrame {
    public GUI() {
        JButton button1=new JButton("Add worker");
        JButton button2=new JButton("Fire worker");
        JButton button3=new JButton("Set bonus");
          JButton button4=new JButton("Correct worker Data");
/*
         JRadioButton radioButton1=new JRadioButton("QA tester");
         JRadioButton radioButton2=new JRadioButton("Java developer");
         JRadioButton radioButton3=new JRadioButton("HR manager");
        JRadioButton radioButton4=new JRadioButton("Back-end developer");


         */
         JLabel label1=new JLabel("Name:");
          JLabel label2=new JLabel("Surname:");
          JLabel label3=new JLabel("Age:");
          JLabel label4=new JLabel("Height:");
          JLabel label5=new JLabel("Experience:");
          JLabel label6=new JLabel("Speciality:");

         JTextField name=new JTextField();
         JTextField surname=new JTextField();
         JTextField age=new JTextField();
         JTextField height=new JTextField();
         JTextField experience=new JTextField();
        JTextField speciality=new JTextField();


        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createSequentialGroup())
                    .addComponent(label1)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4)
                .addGroup(layout.createSequentialGroup())
                    .addComponent(name)
                    .addComponent(surname)
                    .addComponent(age)
                    .addComponent(height)
        );

     layout.setVerticalGroup(layout.createSequentialGroup()
        .addGroup(layout.createSequentialGroup())
              .addComponent(label1)
             .addComponent(name)
        .addGroup(layout.createSequentialGroup())
                .addComponent(label2)
              .addComponent(surname)
        .addGroup(layout.createSequentialGroup())
              .addComponent(label3)
              .addComponent(age)
        .addGroup(layout.createSequentialGroup())
               .addComponent(label4)
               .addComponent(height)
        );

pack();
setTitle("Department");
setDefaultCloseOperation(EXIT_ON_CLOSE);

 //       this.setBounds(100,100,550,200);
    }
}