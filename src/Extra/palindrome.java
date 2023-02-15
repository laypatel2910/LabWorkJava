package Extra;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to you check :");
        int number = sc.nextInt();
        int orignal = number;
        int reverse = 0;
        int store_value;
        do
        {
            store_value = number % 10;
            reverse = reverse * 10 + store_value;
            number /= 10;
        }while(number != 0);
        if (orignal == reverse){
        System.out.println(orignal + " is a palindrome");
        }
        else {
            System.out.println(orignal + " is not a palindrome");
        }


    }
}