package Extra;

import java.util.Scanner;

public class Count_number_of_digits_of_a_number_using_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long number = sc.nextLong();
        long tep = number;
        int count = 0;
        while (tep != 0){
            tep /= 10;
            count++;
        }
        System.out.println(number +" digits of a number is " + count);
    }
}
