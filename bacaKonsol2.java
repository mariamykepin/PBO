/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class bacaKonsol2 {
    public static void main(String args[]) {
        System.out.print("Masukkan data 1: ");
        InputConsole ic = new InputConsole();
        int data1 = ic.readInt();

        System.out.print("Masukkan data 2: ");
        int data2 = ic.readInt();

        int data3 = data1 + data2;
        System.out.println("Hasil data1 + data2: " + data3);
    }
}

