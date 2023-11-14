/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo11;

import java.awt.*;

public class PBO11 extends Frame {

    public static void main(String args[]) {
        PBO11 fwc = new PBO11();
        fwc.setLayout (new FlowLayout()); //akan dibahas pembahasan b
        fwc.setSize(600, 600);
        fwc.add(new Button("Test Me!"));
        fwc.add(new Label ("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg= new CheckboxGroup ();
        fwc.add(new Checkbox ("chkl", cbg, true));
        fwc.add(new Checkbox ("chk2", cbg, false));
        fwc.add(new Checkbox ("chk3", cbg, false));
        fwc.setVisible(true);
            }
}

