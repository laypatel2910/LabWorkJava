package lab_3;

import java.util.Scanner;

public class print_number_divisible_by_2_but_not_divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int first_number = sc.nextInt();
        System.out.println("Enter a last number : ");
        int last_number = sc.nextInt();
        for(int i = first_number;i<=last_number;i++)
        {
            if (i%2==0 && i%3!=0)
            {
                System.out.println(i);
            }
        }
    }
}
