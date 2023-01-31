package lab_3;

import java.util.Scanner;

public class check_isosceles_equilateral_scalene_or_right_angled_triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for side1 : ");
        float side1 = sc.nextFloat();
        System.out.println("Enter a number for side2 : ");
        float side2 = sc.nextFloat();
        System.out.println("Enter a number for side3 : ");
        float side3 = sc.nextFloat();
        float largst1 = side1 * side1;
        float largst2 = side2 * side2;
        float largst3 = side3 * side3;
        if (side1 > side2 && side1 > side3)
        {
            float largst = largst2 + largst3;
            if (largst1 == largst)
            {
                System.out.println("Your triangle is right-angled triangle");
            }
        }
        if (side2 > side1 && side2 > side3)
        {
            float largst = largst1 + largst3;
            if (largst2 == largst)
            {
                System.out.println("Your triangle is right-angled triangle");
            }
        }
        if (side3 > side1 && side3 > side2)
        {

            float largst = largst1 + largst2;
            if (largst3 == largst)
            {
                System.out.println("Your triangle is right-angled triangle");
            }
        }
        if (side1 == side2 && side2 != side3)
        {
            System.out.println("Your triangle is isosceles triangle");
        }
        else if (side1 == side2 && side2 == side3)
        {
            System.out.println("Your triangle is equilateral triangle");
        }
        else if (side1 != side2 && side2 != side3 && side1 != side3)
        {
            System.out.println("Your triangle is scalene triangle");
        }


    }
}
