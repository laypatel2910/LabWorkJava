package Extra;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to you check :");
        int number = sc.nextInt();
        int orignal = number;
        int num = number;
        int index = 0,index2,total = 0,extra,tep;
        while (number != 0) {
            number /= 10;
            index++;
        }
        index2 = index;
        while (num != 0)
        {
           tep = num % 10;
           extra = 1;
           while (index != 0){
               extra *= tep;
               index -- ;
           }
           index = index2;
            total+= extra;
            num /= 10;
        }
        if(orignal == total)
            System.out.println(orignal + " is armstrong");
        else
            System.out.println(orignal + " is not armstrong");
    }
}