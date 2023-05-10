package lab_7;

import java.util.Scanner;

class Circle{

    public double area(double r){
    return 3.14*r*r;
    }
    public double perimeter(double r){
     return 2*3.14*r;
    }
}
public class Circle_class_with_area_and_perimeter {
    public static void main(String[] args) {
        Circle ci = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range : ");
        double range = sc.nextDouble();
        System.out.println("Area of circle = " + ci.area(range));
        System.out.println("Area of perimeter = " + ci.perimeter(range));
    }
}
