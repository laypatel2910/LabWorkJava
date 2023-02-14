package lab_6;

import java.util.Scanner;

public class simple_interest_using_method {
    int simple_interest(int x,int y, int z){
        int ans = (x*y*z)/100;
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        simple_interest_using_method interest = new simple_interest_using_method();
        System.out.println("Enter a amount : ");
        int Principal_amount = sc.nextInt();
        System.out.println("Enter a rate of interest : ");
        int Interest_rate = sc.nextInt();
        System.out.println("Enter a Number of time periods : ");
        int Number_of_time_periods = sc.nextInt();
        int answer = interest.simple_interest(Principal_amount, Interest_rate,Number_of_time_periods);
        System.out.println("your interest is  "+answer);
    }
}
