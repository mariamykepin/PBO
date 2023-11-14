/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9_11 {
    public static void main(String[] args) {
        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 10;
        int result = 10;

        try {
            result = num1 / num2;
            System.out.println("The result is " + result);

            for (int i = 5; i >= 0; i--) {
                System.out.println("The value of array is " + array[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

