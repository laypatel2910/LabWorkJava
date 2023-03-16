package lab_6;

import java.util.Scanner;

public class calculates_area_of_circle_triangle_and_square_using_method_overloading {
    static double area(double radius){
        return (3.14 * radius * radius);
    }
    static double area(double height,double base){
        return (height*base)/2;
    }
    static int area(int side){
        return side*side;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        System.out.println("1 for Area of circle ");
        System.out.println("2 for Area of triangle ");
        System.out.println("3 for Area of square ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("area_of_circle");
                System.out.println("Enter a radius :");
                double radius = sc.nextDouble();
                double Area = area(radius);
                System.out.println("Area of circle : " + Area);
                break;
            case 2:
                System.out.println("area_of_triangle");
                System.out.println("Enter a Height : ");
                double height = sc.nextDouble();
                System.out.println("Enter a Base : ");
                double base = sc.nextDouble();
                double area = area(height, base);
                System.out.println("Area of triangle : " + area);
                break;
            case 3:
                System.out.println("area_of_square");
                System.out.println("Enter a Side : ");
                int side = sc.nextInt();
                int AREA = area(side);
                System.out.println("Area of square : " + AREA);
                break;
            default:
                System.out.println("enter a number between 1 to 3 ");
                break;
        }
    }
}
