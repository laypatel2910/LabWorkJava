package lab_8;

import java.util.Scanner;
class Volume_of_Box {
    double l;
    double b;
    double h;
    Volume_of_Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    void Ans_of_Volume_of_Box(){
        System.out.println("Volume : " + l*b*h);
    }
}
public class Volume_of_Box_Using_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length:");
        double length = sc.nextDouble();
        System.out.println("Enter a width:");
        double width = sc.nextDouble();
        System.out.println("Enter a height:");
        double height = sc.nextDouble();
        Volume_of_Box Vol = new Volume_of_Box(length,width,height);
        Vol.Ans_of_Volume_of_Box();
    }
}
