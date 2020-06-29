import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private String title, author, description;
    private double price;
    private boolean isInStock;
    private static HashMap<String, HashMap<String, String>> dataBase;

    public Book(){
    }

    public Book(String title, String author, String description){
        this();
        this.title = title;
        this.author = author;
        this.description = description;

    }

    public Book(String title, String author, String description, double price, boolean isInStock){
        this(title, author, description);
        this.price = price;
        this.isInStock = isInStock;
    }


    public String getDisplayText(){
        return "Title: " + this.title + " By: " + this.author + "\n Description: " + this.description;
    }

    public void getPriceForNBook(int numberOfBooks) {
        if (numberOfBooks <= 0) System.out.println("Invalid, Please provide 1 or more books.");
        else {
            String result = "";
            if (!this.isInStock) result = "Sorry, Book is not in Stock Yet. Come back later!";
            else {
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
                double totalPrice = numberOfBooks * price;
                result = "The price for " + numberOfBooks + " book";
                if (numberOfBooks > 1) result += "s";
                result += " is " + numberFormat.format(totalPrice);
            }

            System.out.println(result);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isInStock() {
        return this.isInStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }


//    public String toString(){
//        return this.getDisplayText() + "\n" + " Price: " + this.price + " Is In Stock? " + this.isInStock;
//    }

}
