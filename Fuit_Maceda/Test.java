/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fuit_Maceda;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
    

  

        // Create at least 8 Fruit objects
        Fruit[] fruits = {
            new Fruit("F001", "Apple", 85.00),
            new Fruit("F002", "Banana", 45.00),
            new Fruit("F003", "Mango", 120.00),
            new Fruit("F004", "Orange", 75.00),
            new Fruit("F005", "Grapes", 150.00),
            new Fruit("F006", "Watermelon", 100.00),
            new Fruit("F007", "Pineapple", 90.00),
            new Fruit("F008", "Papaya", 65.00)
        };

        // Display fruits before sorting
        System.out.println("======================================");
        System.out.println("       FRUIT LIST BEFORE SORTING");
        System.out.println("======================================");
        System.out.printf("%-8s %-15s %s%n", "ID", "Name", "Price");
        System.out.println("--------------------------------------");

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        // Sort using Insertion Sort
        InsertionSort.sort(fruits);

        // Display fruits after sorting
        System.out.println("\n======================================");
        System.out.println("       FRUIT LIST AFTER SORTING");
        System.out.println("======================================");
        System.out.printf("%-8s %-15s %s%n", "ID", "Name", "Price");
        System.out.println("--------------------------------------");

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        // Display Top 3 cheapest fruits
        System.out.println("\n======================================");
        System.out.println("          TOP 3 CHEAPEST FRUITS");
        System.out.println("======================================");
        System.out.printf("%-8s %-15s %s%n", "ID", "Name", "Price");
        System.out.println("--------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(fruits[i]);
        }
    }
}

    