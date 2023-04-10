package lab_10;

import java.util.Scanner;

class shape{
    Scanner sc = new Scanner(System.in);
    double square;
    double circle;
    double triangle;
}
class triangle extends shape{
    void get_value_of_triangle_and_find_area_of_triangle (){
        System.out.println("Enter a Height of triangle ");
        double Height = sc.nextDouble();
        System.out.println("Enter a Base of triangle ");
        double Base = sc.nextDouble();
        triangle = Height * Base/2;
        System.out.println("Area of triangle is : " + triangle);
    }
}
class circle extends shape{
    void get_value_of_circle_and_find_area_of_circle (){
        System.out.println("Enter a Radius of circle : ");
        double Radius = sc.nextInt();
        circle = 3.14 * Radius * Radius;
        System.out.println("Area of triangle is : " + circle);
    }
}
class square extends shape{
    void get_value_of_square_and_find_area_of_shape (){
        System.out.println("Enter a Side of square : ");
        double side = sc.nextInt();
        square = side * side;
        System.out.println("Area of triangle is : " + square);
    }
}

public class area_of_shape {
    public static void main(String[] args) {
        triangle t = new triangle();
        circle c = new circle();
        square sq = new square();
        t.get_value_of_triangle_and_find_area_of_triangle();
        c.get_value_of_circle_and_find_area_of_circle();
        sq.get_value_of_square_and_find_area_of_shape();
    }
}
