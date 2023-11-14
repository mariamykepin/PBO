/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author マリア
 */
public class PBO9_3 {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){ 
        f();
    }
    public static void main(String[] args){ 
        g();
    }
}
