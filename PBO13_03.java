/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Solve extends JFrame implements ItemListener {
    // frame
    static JFrame f;
    // label
    static JLabel l, l1;
    // combobox
    static JComboBox<String> c1;

    // main class
    public static void main(String[] args) {
        // create a new frame
        f = new JFrame("Frame");

        // create a object solve
        Solve s = new Solve();

        // set layout of frame
        f.setLayout(new FlowLayout());

        // array of string containing cities
        String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" };

        // create combobox
        c1 = new JComboBox<>(s1);

        // add ItemListener
        c1.addItemListener(s);

        // create labels
        l = new JLabel("Select your city ");
        l1 = new JLabel("Jalpaiguri selected");

        // set color of text
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);

        // create a new panel
        JPanel p = new JPanel();
        p.add(l);

        // add combobox to panel
        p.add(c1);
        p.add(l1);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(400, 300);

        // set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set visible
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        // if the state combobox is changed
        if (e.getSource() == c1) {
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }
}

