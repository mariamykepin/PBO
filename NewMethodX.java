/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
import java.util.Scanner;

public class NewMethodX {
    public static double volumeTabung(int diameter, int tinggi) {
        int jari2 = diameter / 2;
        double luasAlas = Math.PI * Math.pow(jari2, 2);
        return luasAlas * tinggi;
    }

    public static double volumeKerucut(int diameter, int tinggi) {
        int jari2 = diameter / 2;
        double luasAlas = Math.PI * Math.pow(jari2, 2);
        return (luasAlas * tinggi) / 3.0;
    }

    public static double volumeBola(int diameter) {
        int jari2 = diameter / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Berikut pilihan bangun ruang untuk dihitung :  ");
        System.out.println("1. Tabung ");
        System.out.println("2. Kerucut ");
        System.out.println("3. Bola ");
        System.out.println("Masukkan pilihan [1/2/3] : ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan diameter: ");
        int diameter = scanner.nextInt();

        double volume = 0.0;

        if (pilihan==1) {
            System.out.print("Masukkan tinggi: ");
            int tinggi = scanner.nextInt();
            volume = volumeTabung(diameter, tinggi);
        } else if (pilihan==2) {
            System.out.print("Masukkan tinggi: ");
            int tinggi = scanner.nextInt();
            volume = volumeKerucut(diameter, tinggi);
        } else if (pilihan==3) {
            volume = volumeBola(diameter);
        } else {
            System.out.println("Jenis bangun tidak dikenal.");
        }

        scanner.close();

        if (volume > 0) {
            System.out.println("Volume: " + volume);
        }
    }
}

