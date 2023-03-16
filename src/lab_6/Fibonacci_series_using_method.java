package lab_6;

import java.util.Scanner;

public class Fibonacci_series_using_method {
    void Fibonacci_series(int number) {
        int number_1 = 0,number_2 = 1;
        for (int i = 4;i <= number + 1;i++){
            if (i % 2 == 0) {
                number_1 = number_1 + number_2;
                System.out.print((i == number + 1)?number_1: number_1 + ",");
            } else {
                number_2 = number_1 + number_2;
                System.out.print((i == number + 1)?number_2:number_2 + ",");
            }
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.print((number == 0)?" ":(number == 1)? "0":(number == 2)? "0,1":"0,1,");
        Fibonacci_series_using_method series = new Fibonacci_series_using_method();
        series.Fibonacci_series(number);
    }
}