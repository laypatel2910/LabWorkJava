package lab_6;

import java.util.Scanner;

public class addition_of_2_number_using_method {
    public static int addition(int x,int y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number 1 :");
        int n1 = sc.nextInt();
        System.out.println("enter a number 2 :");
        int n2 = sc.nextInt();
        int c = addition(n1,n2);
        System.out.println("answer : " + c);
    }
}
