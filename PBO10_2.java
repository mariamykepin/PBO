/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo10;

/**
 *
 * @author マリア
 */
public class PBO10_2 {
    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        printArray(integerArray);

        System.out.println("\nArray doubleArray contains: ");
        printArray(doubleArray);

        System.out.println("\nArray characterArray contains: ");
        printArray(characterArray);
    }
}

