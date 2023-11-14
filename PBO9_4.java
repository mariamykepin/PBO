/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

import java.util.Date;
import java.util.EmptyStackException;
import java.util.Stack;

public class PBO9_4 {
    public static void main(String[] args) {
        int count = 1000000;
        Stack s = new Stack();
        System.out.println("Testing for empty stack");
        
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            if (!s.empty()) { // Ubah is.empty() menjadi !s.empty()
                s.pop();
            }
        }
        long s2 = System.currentTimeMillis(); // Tambahkan titik koma
        
        System.out.println((s2 - s1) + " milliseconds"); // Ganti spasi antara s2 dan s1 dengan tanda '-'
        System.out.println("Catching EmptyStackException");
        
        long s3 = System.currentTimeMillis(); // Deklarasi s3
        for (int i = 0; i < count; i++) {
            try {
                s.pop();
            } catch (EmptyStackException e) { // Tambahkan kurung kurawal
            }
        }
        long s4 = System.currentTimeMillis(); // Deklarasi s4
        System.out.println((s4 - s3) + " milliseconds"); // Ganti spasi antara s4 dan s3 dengan tanda '-'
    }
}

