package test.Questions.Question01;

public class Product {
    private String name;
    private double price;
    private int stock;
    private String category;

    // Constructor
    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Update Quantity Method
    public void updateStock(int qty){
        if(qty>stock){
            System.out.println("Error: Insufficient stock. Sale cannot be completed.");
        }
        else{
            stock -= qty;
            System.out.println("Stock updated successfully. ");
        }
    }


    // Display Method
    public void displayProduct(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("Product Stock: "+stock);
        System.out.println("Product Category: "+category);
        System.out.println();
    }
}
