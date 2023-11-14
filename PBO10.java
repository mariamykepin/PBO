/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo10;

/**
 *
 * @author マリア
 */
public class PBO10 {
    public static long fibonacci(long number) {
    if ((number == 0) || (number == 1))
        return number;
    else
        return fibonacci(number - 1) + fibonacci (number - 2);
}
public static void main(String[] args) {
for (int counter = 0; counter <= 10; counter++){ System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
}
}
    
}
