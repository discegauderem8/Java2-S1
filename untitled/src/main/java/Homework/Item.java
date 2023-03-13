package Homework;

public class Item {
    private String name;
    private int price;
    private double rating;

    public Item(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Item(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
