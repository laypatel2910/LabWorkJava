package lab_2;

import java.util.Scanner;

public class Calculate_percentage_and_print_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a subject 1 marks :");
        float subject_1 = sc.nextFloat();
        System.out.println("Enter a subject 2 marks :");
        float subject_2 = sc.nextFloat();
        System.out.println("Enter a subject 3 marks :");
        float subject_3 = sc.nextFloat();
        System.out.println("Enter a subject 4 marks :");
        float subject_4 = sc.nextFloat();
        System.out.println("Enter a subject 5 marks :");
        float subject_5 = sc.nextFloat();
        double percentage = (subject_1 + subject_2 + subject_3 + subject_4 + subject_5)/5;
        System.out.println(percentage + "% is your percentage");
        if(percentage < 35)
        {
            System.out.println("your result is fail/n");
        }
        else if (percentage >= 35 && percentage <= 45)
        {
            System.out.println("your result is  pass Class");
        }
        else if(percentage >= 46 && percentage <= 60)
        {
            System.out.println("your result is  Second Class");
        }
        else if(percentage >= 60 && percentage <= 70)
        {
            System.out.println("your result is first Class");
        }
        else
        {
            System.out.println("your result is Distinction");
        }

    }
}
