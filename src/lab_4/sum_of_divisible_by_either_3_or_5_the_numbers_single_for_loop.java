package lab_4;

import java.util.Scanner;

public class sum_of_divisible_by_either_3_or_5_the_numbers_single_for_loop {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number [] = new int[sc.nextInt()];
        for (int i = 0; i< number.length; i++)
        {
            System.out.println("Enter a number " + (i + 1) + ":");
            number[i] = sc.nextInt();
            if(number[i] % 3 == 0 || number[i] % 5 == 0){
                sum = sum + number[i];
            }
        }
        System.out.println("The sum of divisible by either 3 or 5 the numbers  = " + sum);
    }
}
