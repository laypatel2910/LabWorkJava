package lab_6;

import java.util.Scanner;

public class calculates_area_of_circle_triangle_and_square_using_method_overloading {
    static float area(float radius){
        return (float) (3.14 * radius * radius);
    }
    static double area(double height,double base){
        return (height*base)/2;
    }
    static int area(int side){
        return side*side;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("area_of_circle");
        System.out.println("Enter a radius :");
        float radius = sc.nextFloat();
        float Area = area(radius);
        System.out.println("Area of circle : " + Area);
        System.out.println("area_of_triangle");
        System.out.println("Enter a Height : ");
        double height = sc.nextDouble();
        System.out.println("Enter a Base : ");
        double base = sc.nextDouble();
        double area = area(height,base);
        System.out.println("Area of triangle : " + area);
        System.out.println("area_of_square");
        System.out.println("Enter a Side : ");
        int side = sc.nextInt();
        int AREA = area(side);
        System.out.println("Area of square : " + AREA);
    }
}
