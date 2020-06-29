public class Book {
    private String title, author, description;
    private double price;
    boolean isInStock;

    public Book(){

    }

    public Book(String title, String author, String description, double price, boolean isInStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Book(String title, String author, String description){
        //new Book(title, author, description, 0.0,false);
        this.title = title;
        this.author = author;
        this.description = description;
    }


    public String getDisplayText(){
        return "Title: " + this.title + " By: " + this.author + "\n Description: " + this.description;
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
