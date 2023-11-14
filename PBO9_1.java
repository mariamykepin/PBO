/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

class Animal extends Exception {}

class Mammal extends Animal {}

public class PBO9_1 {
    public static void main(String[] args) {
        try {
            throw new Mammal();
        } catch (Mammal m) {
            System.err.println("It is mammal");
        } catch (Animal a) {
            System.err.println("It is animal");
        }
    }
}
