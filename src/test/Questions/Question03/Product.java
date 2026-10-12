package test.Questions.Question03;

public class Product {
    // Instance Variables
    private int productID;
    private String productName;
    private double price;
    private int quantity;

    // Default Constructor
    public Product(){

    }

    // Getters and Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.out.println("price should always be greater than 0.");
        }
        else{
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.out.println("Quantity should not be negative");
        }
        else{
            this.quantity = quantity;
        }
    }

    // Calculate Total Value Method
    public double calculateTotalValue(){
        return price * quantity;
    }


    //Display Method
    public void displayDetails(){
        System.out.println("--- Product Details ---");
        System.out.println("Product ID: "+productID);
        System.out.println("Product Name: "+productName);
        System.out.println("Price: Rs. "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Value of the products: Rs. "+calculateTotalValue());
        System.out.println();
    }
}
