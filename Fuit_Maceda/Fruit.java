/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fuit_Maceda;

/**
 *
 * @author User
 */
public class Fruit {
 
    private String fruitId;
    private String name;
    private double price;

    public Fruit(String fruitId, String name, double price) {
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
    }

    public String getFruitId() {
        return fruitId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-15s ₱%.2f",
                fruitId, name, price);
    }
}


