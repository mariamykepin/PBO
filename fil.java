/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
        
public class fil extends JFrame{ 
    JTextArea nama=new JTextArea (10,10);
    JButton bt=new JButton("Copy"); 
    JTextArea txnama=new JTextArea (10,10);
    
    fil() { 
        super("INI ADALAH FORM");
        setLocation (200,300);
        setSize (400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible (true);
    }
    void tampilan () { 
        getContentPane().add(nama);
        nama.append("nama kamu siapa"); 
        getContentPane().add(bt); 
        getContentPane().add(txnama); 
        txnama.setBackground(Color.LIGHT_GRAY); 
        bt.addActionListener(new ActionListener() { 
            public void actionPerformed (ActionEvent e) { 
                txnama.append(nama.getSelectedText());
            }
           });
        getContentPane().setLayout(new FlowLayout()); 
        setVisible(true);
    }
    public static void main(String args[]) {
        fil f=new fil();
        f.tampilan();
    }
}