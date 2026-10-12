package com.primeridez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = input.nextLine();

        System.out.println();
        System.out.println("You typed the sentence: "+sentence);
        System.out.println();

        input.close();
    }
}
