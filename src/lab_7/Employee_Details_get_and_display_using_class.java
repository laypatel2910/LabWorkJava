package lab_7;

import java.util.Scanner;

class Employee{
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    void GetEmployeeDetails (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Employee_ID : ");
        Employee_ID = sc.nextInt();
        System.out.println("Enter a Employee_Name : ");
        Employee_Name = sc.nextLine();
        Employee_Name = sc.nextLine();
        System.out.println("Enter a Designation : ");
        Designation = sc.next();
        System.out.println("Enter a Age : ");
        Age = sc.nextInt();
        System.out.println("Enter a Salary : ");
        Salary = sc.nextDouble();
    }
    void DisplayEmployeeDetails (){
        System.out.println("Employee_Name : " + Employee_Name);
        System.out.println("Designation : " + Designation);
        System.out.println("Employee_ID : " + Employee_ID);
        System.out.println("Age : " + Age);
        System.out.println("Salary : " + Salary);
    }
}

public class Employee_Details_get_and_display_using_class {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.GetEmployeeDetails();
        emp.DisplayEmployeeDetails();
    }
}
