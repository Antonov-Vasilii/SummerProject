package preparation.calculator2;

import preparation.calculator.Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator2 {
    public static void main(String[] args) {

        Calculator2 calc = new Calculator2();
    }
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;

    JPanel p1;

    Calculator2(){
        windowContent = new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);


        displayField = new JTextField(30);
        windowContent.add("North", displayField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        p1 = new JPanel();
      //  GridLayout gl = new GridLayout();
        BoxLayout boxl = new BoxLayout(p1, BoxLayout.X_AXIS);
        p1.setLayout(boxl);

        p1.add(button0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        windowContent.add("Center", p1);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        frame.pack();
        frame.setVisible(true);

    }
}
