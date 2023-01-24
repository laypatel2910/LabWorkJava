package lab_2;
import java.util.Scanner;
public class body_mass_index
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("body_mass_index");
        System.out.println("Enter a weight :");
        double pounds = sc.nextDouble();
        System.out.println("Enter a height :");
        double inches = sc.nextDouble();
        double weight;
        double temporary_height;
        weight = pounds * 0.45359237;
        temporary_height = inches * 0.0254;
        double height = temporary_height*temporary_height;
        double Body_mass_index;
        Body_mass_index = weight/height;
        System.out.println("The body_mass_index is :");
        System.out.println(Body_mass_index);
    }
}
