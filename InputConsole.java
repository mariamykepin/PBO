/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputConsole {
    public static String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        try {
            string = br.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public static int readInt() {
        return Integer.parseInt(readString());
    }

    public static double readDouble() {
        return Double.parseDouble(readString());
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = readString();
        System.out.println("You entered: " + str);

        System.out.print("Enter an integer: ");
        int num = readInt();
        System.out.println("You entered: " + num);

        System.out.print("Enter a double: ");
        double dbl = readDouble();
        System.out.println("You entered: " + dbl);
    }
}

