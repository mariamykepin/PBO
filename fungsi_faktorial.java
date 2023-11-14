/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class fungsi_faktorial {
    public void test(int data) {
        int nilai = 1;

        if (data == 0 || data == 1) {
            nilai = 1;
        } 
        else {
            for (int i = 1; i <= data; i++) {
                nilai *= i;
            }
        }
        System.out.println(data + "! = " + nilai);
    }

    public static void main(String args[]) {
        fungsi_faktorial f5 = new fungsi_faktorial();
        f5.test(4);
        f5.test(5);
    }
}

