/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fuit_Maceda;

/**
 *
 * @author User
 */
public class InsertionSort {
   

    public static void sort(Fruit[] fruits) {

        for (int i = 1; i < fruits.length; i++) {

            Fruit key = fruits[i];
            int j = i - 1;

            // Compare the PRICE of the Fruit objects
            while (j >= 0 && fruits[j].getPrice() > key.getPrice()) {
                fruits[j + 1] = fruits[j];
                j--;
            }

            fruits[j + 1] = key;
        }
    }
}

