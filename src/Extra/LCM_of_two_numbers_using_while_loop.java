package Extra;

import java.util.Scanner;

public class LCM_of_two_numbers_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 number to find LCM :");
        int number_1 = sc.nextInt();
        int number_2 = sc.nextInt();
        int largest_number = Math.max(number_1, number_2);//(number_1 > number_2)?number_1 : number_2
        int lcm = largest_number;
        while (lcm <= number_1*number_2){
            if (lcm % number_1 == 0 && lcm % number_2 == 0){
                break;
            }
            lcm += largest_number;
        }
        System.out.println("LCM of " + number_1 + " and " + number_2 + " is : " + lcm);
    }
}
