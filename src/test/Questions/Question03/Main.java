package test.Questions.Question03;

import java.util.Scanner; // importing the scanner class

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating the Scanner object
        Product product = new Product(); // product Object from the Product Class

        System.out.print("Enter the Product ID: "); // getting input for Product ID
        int productId = input.nextInt();
        product.setProductID(productId); // setting the product ID
        input.nextLine(); // Clearing the buffer

        System.out.print("Enter the Product Name: "); // getting input for product Name
        String productName = input.nextLine();
        product.setProductName(productName); // setting the product Name

        System.out.print("Enter the Price: Rs. "); // getting input for price
        double price = input.nextDouble();
        product.setPrice(price); // setting the price

        System.out.print("Enter the Quantity: "); //getting input for quantity
        int quantity = input.nextInt();
        product.setQuantity(quantity); // setting the quantity

        System.out.println(); // empty print line to maintain cleanness
        product.displayDetails(); // Displaying the product details

        input.close(); // Closing the Scanner Class
    }
}
