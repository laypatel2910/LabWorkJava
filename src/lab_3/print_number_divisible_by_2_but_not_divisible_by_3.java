package lab_3;

import java.util.Scanner;

public class print_number_divisible_by_2_but_not_divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        for(int i = 1;i<=number;i++)
        {
            if (i%2==0 && i%3!=0)
            {
                System.out.println(i);
            }
        }
    }
}
