package pbo11;

import java.awt.*;
import java.awt.event.*;

public class PBO11 extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public PBO11() {
        Label l1 = new Label("Masukkan Angka Pertama:");
        l1.setBounds(50, 50, 150, 20);
        t1 = new TextField();
        t1.setBounds(50, 70, 150, 20); 
        
        Label l2 = new Label("Masukkan Angka Kedua:"); 
        l2.setBounds(50, 100, 150, 20); 
        t2 = new TextField();
        t2.setBounds(50, 120, 150, 20); 
        
        Label l3 = new Label("Masukkan Angka Pertama:"); 
        l3.setBounds(50, 150, 150, 20); 
        t3 = new TextField();
        t3.setBounds(50, 170, 150, 20); 
        

        b1 = new Button("+");
        b1.setBounds(50, 200, 50,30);
        b2 = new Button("-");
        b2.setBounds(110, 200, 50, 30);
        b3 = new Button("/");
        b3.setBounds(170, 200, 50, 30);
        b4 = new Button("*");
        b4.setBounds(110, 250, 50, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(250, 300);
        setLayout(null);
        setVisible(true);
        setTitle("Design Calculator");
    }

    public void actionPerformed(ActionEvent f) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = 0;
        int e = 0;

        if (f.getSource() == b1) {
            d = a + b;
        } else if (f.getSource() == b2) {
            d = a - b;
        } else if (f.getSource() == b3) {
            if (b != 0) {
                d = a / b;
            } else {
                System.out.println("Error: Division by zero.");
                return;
            }
        } else if (f.getSource() == b4) {
            d = a * b;
        }

        if (f.getSource() == b1) {
            e = d + c;
        } else if (f.getSource() == b2) {
            e = d - c;
        } else if (f.getSource() == b3) {
            if (c != 0) {
                e = d / c;
            } else {
                System.out.println("Error: Division by zero.");
                return;
            }
        } else if (f.getSource() == b4) {
            e = d * c;
        }

        String result = String.valueOf(e);
        System.out.println("Result: " + result);
    }

    public static void main(String args[]) {
        new PBO11();
    }

}