package lab_8;

import java.util.Scanner;

class Complex_number{
    int real;
    int imaginary;
    Complex_number(){

    }
    Complex_number(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void addition(Complex_number number_1,Complex_number number_2){
        real = number_1.real + number_2.real;
        imaginary = number_1.imaginary + number_2.imaginary;
        System.out.println("Complex number sum is " + real +" + i"+ imaginary);
    }
}
public class Sum_of_2_Complex_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number : ");
        int real_number_1 = sc.nextInt();
        System.out.println("Enter a imaginary number : ");
        int imaginary_number_1 = sc.nextInt();
        System.out.println("You entered Complex number " + real_number_1 + " + i" + imaginary_number_1);
        Complex_number c_n1 = new Complex_number(real_number_1, imaginary_number_1);
        System.out.println("Enter a real number : ");
        int real_number_2 = sc.nextInt();
        System.out.println("Enter a imaginary number : ");
        int imaginary_number_2 = sc.nextInt();
        System.out.println("You entered Complex number " + real_number_2 + " + i" + imaginary_number_2);
        Complex_number c_n2 = new Complex_number(real_number_2, imaginary_number_2);
        c_n1.addition(c_n1,c_n2);
    }
}
