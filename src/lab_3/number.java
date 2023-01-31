package lab_3;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of call :");
        int calls = sc.nextInt();
        if(calls<=100) {
            double bill;
            bill = 200;
            System.out.println(bill + " is your telephone bill ");
        }
        else if (calls>100 && calls<=150)
        {
            double bill;
            calls=calls-100;
            bill=200+(0.60*calls);
            System.out.println(bill + " is your telephone bill ");
        }
        else if (calls>150 && calls<=200)
        {
            double bill;
            calls=calls-150;
            bill=200+(0.60*50)+(0.50*calls);
            System.out.println(bill + " is your telephone bill ");
        }
        else
        {
            double bill;
            calls=calls-200;
            bill=200+(0.60*50)+(0.50*50)+(0.40*calls);
            System.out.println(bill + " is your telephone bill ");
        }
    }
}