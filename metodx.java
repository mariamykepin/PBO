/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;
public class metodx {
    //fungsi
    public double luasLingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    // Prosedur
    public void hitungLuasLingkaran(int jari2) {
        double luas = Math.PI * Math.pow(jari2, 2);
        System.out.println("Luas: " + luas);
    }

    public static void main(String[] args) {
        metodx mt = new metodx();
        mt.hitungLuasLingkaran(10);
        System.out.print(mt.luasLingkaran(20));
        System.exit(0);
    }
}

