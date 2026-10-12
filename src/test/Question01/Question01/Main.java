package test.Question01.Question01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String productName = input.nextLine();

        System.out.print("Enter Product Price: ");
        double productPrice = input.nextDouble();

        System.out.print("Enter Product Stock: ");
        int productStock = input.nextInt();
        input.nextLine();

        System.out.print("Enter Product Category: ");
        String productCategory = input.nextLine();

        Product product = new Product(productName,productPrice,productStock,productCategory);
        System.out.println();

        // Displaying the product details
        System.out.println("--- Product Details ---");
        product.displayProduct();

        System.out.print("Enter quantity to sell: ");
        int quantity = input.nextInt();
        product.updateStock(quantity);
        System.out.println();

        System.out.println("--- Updated Product Details ---");
        product.displayProduct();

        input.close();
    }
}
