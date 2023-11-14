/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import java.awt.*;

public class FlowLayoutDemo extends Frame{
    public static void main(String args[]) {
        FlowLayoutDemo fld = new FlowLayoutDemo ();
        fld.setLayout(new FlowLayout()); 
        fld.add(new Button("ONE")); 
        fld.add(new Button("TWO")); 
        fld.add(new Button("THREE")); 
        fld.setSize(100, 100); 
        fld.setVisible (true);
    }
}

