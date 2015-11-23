package com.gaby;

public class Drink {

    private String name;
    private double cost;
    private double price;
    private int totalSold;


    public Drink(String name, double cost, double price, int totalSold) {
        super();
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

  /*  @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", company="
                + company + ", total=" + total + ", available=" + available
                + "]";
    }
*/

        }
    