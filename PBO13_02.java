/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PBO13_02 {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    final JLabel lb = new JLabel("");
    final String[] items = {" roti", "Madu"};
    final JComboBox comboBox = new JComboBox(items);
    JPanel pn = new JPanel();
    frame.add(pn, BorderLayout.WEST);
    pn.add(comboBox, BorderLayout.CENTER);
    pn.add(lb, BorderLayout.NORTH);
    comboBox.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
        String mn = (String) comboBox.getSelectedItem(); lb.setText(mn);
        }
    });
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setVisible(true);
    }
}
