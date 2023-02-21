package Extra;

import java.util.Scanner;

public class series_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i * i;
            System.out.print((i == number)?(i * i) + " = ":(i * i) + " + ");
        }
        System.out.print(sum);
    }
}
