/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
import javax.swing.JOptionPane;

public class HitungLuasBangun {
    public static void main(String[] args) {
        String[] options = { "Persegi Panjang", "Segitiga", "Lingkaran" };
        int choice = JOptionPane.showOptionDialog(
            null,
            "Pilih jenis bangun:",
            "Hitung Luas Bangun",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
        );

        switch (choice) {
            case 0:
                hitungLuasPersegiPanjang();
                break;
            case 1:
                hitungLuasSegitiga();
                break;
            case 2:
                hitungLuasLingkaran();
                break;
        }
    }

    public static void hitungLuasPersegiPanjang() {
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        double luas = panjang * lebar;
        JOptionPane.showMessageDialog(null, "Luas persegi panjang: " + luas);
    }

    public static void hitungLuasSegitiga() {
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang alas segitiga:"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double luas = 0.5 * alas * tinggi;
        JOptionPane.showMessageDialog(null, "Luas segitiga: " + luas);
    }

    public static void hitungLuasLingkaran() {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double luas = Math.PI * Math.pow(radius, 2);
        JOptionPane.showMessageDialog(null, "Luas lingkaran: " + luas);
    }
}

