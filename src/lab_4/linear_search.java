package lab_4;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int not_number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many you want enter a number: ");
        int number[] = new int[sc.nextInt()];
        for (int i = 0; i<number.length;i++){
            System.out.println("Enter a number " + (i + 1) + ":");
            number[i] = sc.nextInt();
        }
        System.out.println("Enter a number to you want a search");
        int search_number = sc.nextInt();
        for (int i = 0; i<number.length;i++){
            int t = i + 1;
            if (search_number == number[i])
            {
                System.out.println(search_number + " index is " + t);
                not_number = 1;
                break;
            }
            if (not_number == 0) {
                not_number = -1;
            }
        }
        if (not_number == -1)
         System.out.println(search_number +  " is not present in array");
    }
}
