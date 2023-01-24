package lab_2;
import java.util.Scanner;
import java.lang.Math;
public class diameter {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a area");
        float area = sc.nextFloat();
        double Duplicate_radius = area/3.14;
        double radius = Math.sqrt(Duplicate_radius);
        System.out.println("Diameter is " + radius);
    }
}
