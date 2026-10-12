package test.Questions.Question04;

import java.util.Scanner; // Importing the Scanner Class

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating the Scanner object
        Employee employee = new Employee(); // Employee Object

        System.out.print("Enter Employee ID: "); // Getting input for Employee ID
        int employeeID = input.nextInt();
        employee.setEmployeeID(employeeID);
        input.nextLine(); // Clearing the buffer

        System.out.print("Enter Employee Name: "); // Getting input for Employee Name
        String employeeName = input.nextLine();
        employee.setEmployeeName(employeeName);

        System.out.print("Enter Basic Salary: "); // Getting input for Basic Salary
        double basicSalary = input.nextDouble();
        employee.setBasicSalary(basicSalary);

        System.out.print("Enter Performance Rating (1-5): "); // Getting input for Performance Rating
        int performanceRating = input.nextInt();
        employee.setPerformanceRating(performanceRating);

        System.out.println();
        employee.displayEmployeeDetails(); // Display Method

        input.close(); // Closing the Scanner Class
    }
}
