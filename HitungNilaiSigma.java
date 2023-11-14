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

public class HitungNilaiSigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        double hasil = hitungNilaiSigma(n, x);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }

    public static double hitungNilaiSigma(int n, int x) {
        double hasil = 0.0;
        for (int i = 1; i <= n; i++) {
            hasil += x + 2 * i;
        }

        return hasil;
    }
}

