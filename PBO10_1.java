/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10;

class MyClass {
    int height;

    MyClass() {
        System.out.println("bricks");
        height = 0;
    }

    MyClass(int i) {
        System.out.println("Building new House that is " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("House is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": House is " + height + " feet tall");
    }
}
public class PBO10_1 {
    public static void main(String[] args) {
        MyClass t = new MyClass(0);
        t.info();
        t.info("overloaded method");
    }
}
