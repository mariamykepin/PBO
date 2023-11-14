/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9_8{
    public static void main(String[] args) {
        try {
            throw new Exception("throwing an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
