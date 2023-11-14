/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import javax.swing.*;
import java.awt.*;

class CobaGUI_1 extends JFrame {
    JButton cb1 = new JButton("Pilih A");
    JButton cb2 = new JButton("Pilih B");

    CobaGUI_1() {
        setTitle("Program GUI Pertamaku");
        setLocation(200, 100);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);

        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);

        setVisible(true);
    }

    public static void main(String args[]) {
        CobaGUI_1 ZZ = new CobaGUI_1();
        ZZ.objek();
    }
}

