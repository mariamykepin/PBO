/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class SegiEmpat {
    public void segiEmpat(int panjang, int lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Panjang Segi Empat: " + panjang);
        System.out.println("Lebar Segi Empat: " + lebar);
        System.out.println("Luas Segi Empat: " + luas);
        System.out.println("Keliling Segi Empat: " + keliling);
    }

    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat();
        se.segiEmpat(10, 5);
    }
}