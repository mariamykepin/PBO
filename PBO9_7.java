/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9_7 {
    double method(int i) throws Exception {
        return i / 0;
    }

    boolean method(boolean b) {
        return !b;
    }

    static double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }
    public static void main(String[] args) {
    PBO9_7 mn = new PBO9_7();
    try {
        System.out.println(mn.method(10, 20.0));
        System.out.println(mn.method(10.0, 20));
        System.out.println(mn.method(10.0, 20.0));
        System.out.println(mn.method(10));
    } catch (Exception ex) {
        System.out.println("exception occurred: " + ex);
    }
}
}



