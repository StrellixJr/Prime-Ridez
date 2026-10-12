package test.Questions.Question04;

public class Employee {
    // Instance variables
    private int employeeID;
    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    // Default Constructor
    public Employee(){

    }

    // Getters and Setters for the Instance Variables
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    // CalculateBonus() Method
    public double calculateBonus(){
        double bonusPercentage;
        if(performanceRating == 5){
            bonusPercentage = 0.20;
        }
        else if(performanceRating == 4){
            bonusPercentage = 0.15;
        }
        else if(performanceRating == 3){
            bonusPercentage = 0.10;
        }
        else if(performanceRating == 2){
            bonusPercentage = 0.05;
        }
        else{
            bonusPercentage = 0.0;
        }

        double bonusAmount = basicSalary * bonusPercentage;
        return bonusAmount;
    }

    //calculateTotalSalary() Method
    public double calculateTotalSalary(){
        return basicSalary + calculateBonus();
    }

    // Display Details Method
    public void displayEmployeeDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Name: "+employeeName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Performance Rating: "+performanceRating);
        System.out.println("Bonus: "+calculateBonus());
        System.out.println("Total Salary: "+calculateTotalSalary());
        System.out.println();
    }

}
