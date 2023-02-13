package lab_4;

import java.util.Scanner;

public class count_number_of_even_or_odd_number_multi_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0,odd = 0;
        System.out.println("How many you want enter a number : ");
        int number [] = new int[sc.nextInt()];
        for (int i = 0 ; i < number.length ;i++){
            System.out.println("Enter a number " + (i + 1) + " :" );
            number[i] = sc.nextInt();
        }
        System.out.println("Even number is : ");
        for (int i = 0 ; i < number.length ;i++){
            if(number[i] % 2 == 0)
            {
                even = even + 1;
                System.out.println(number[i]);
            }
        }
        System.out.println("Total even number is " + even);
        System.out.println("Odd number is : ");
        for (int i = 0 ; i < number.length ;i++){
                if(number[i] % 2 != 0)
                {
                    odd = odd + 1;
                    System.out.println(number[i]);
                }
        }
        System.out.println("Total odd number is " + odd);
    }
}