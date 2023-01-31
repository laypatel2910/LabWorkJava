package lab_3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Factorial = 1;
        int i;
        System.out.println("Enter a number of you want factorial : ");
        int number = sc.nextInt();
        for(i=1;i<=number;i++)
        {
            Factorial = Factorial * i;
        }

        System.out.println(Factorial);
    }
}
