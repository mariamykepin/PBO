/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo11;

import java.awt.*;

class BorderLayoutDemo extends Frame {
    public static void main(String args[]) {
    BorderLayoutDemo bld = new BorderLayoutDemo (); 
    bld.setLayout (new BorderLayout (10, 10)); //may remove 
    bld.add(new Button("NORTH"), BorderLayout.NORTH); 
    bld.add(new Button("SOUTH"), BorderLayout.SOUTH); 
    bld.add(new Button("EAST"), BorderLayout.EAST); 
    bld.add(new Button("WEST"), BorderLayout.WEST); 
    bld.add(new Button("CENTER"), BorderLayout.CENTER); 
    bld.setSize (200, 200); 
    bld.setVisible(true);
    }
}
