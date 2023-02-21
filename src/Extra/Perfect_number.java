package Extra;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to you check :");
        int number = sc.nextInt();
        int total = 0;
        for (int i = 1 ;i < number ;i++){
            if (number % i == 0)
                total += i;
        }
        if (total == number) {
            System.out.println(number + " is a Perfect number");
        }
        else {
            System.out.println(number + " is a not Perfect number");
        }
    }
}
