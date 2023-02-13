package lab_4;

import java.util.Scanner;

public class count_number_of_even_or_odd_number_single_for_loop {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        Scanner sc = new Scanner(System.in);
        int number [] = new int[sc.nextInt()];
        for (int i = 0; i< number.length; i++)
        {
            System.out.println("Enter a number " + (i + 1) + " :" );
            number[i] = sc.nextInt();
            if (number[i]%2==0)
                even = even + 1;
            else
                odd = odd + 1;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
