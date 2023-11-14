/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9_6 {
    public static void main(String[] args) throws Exception {
        int n=20, result=0;
        try {
            result = n / 0;
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occurred: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("Chained exception thrown manually: " + ex1);
            }
        }
    }
}

