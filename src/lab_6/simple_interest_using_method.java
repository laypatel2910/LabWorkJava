package lab_6;

import java.util.Scanner;

public class simple_interest_using_method {
    double simple_interest(double x,double y, double z){
        return  (x*y*z)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        simple_interest_using_method interest = new simple_interest_using_method();
        System.out.println("Enter a amount : ");
        double Principal_amount = sc.nextDouble();
        System.out.println("Enter a rate of interest : ");
        double Interest_rate = sc.nextDouble();
        System.out.println("Enter a Number of time periods : ");
        double Number_of_time_periods = sc.nextDouble();
        double answer = interest.simple_interest(Principal_amount, Interest_rate,Number_of_time_periods);
        System.out.println("your interest is  "+answer);
    }
}
