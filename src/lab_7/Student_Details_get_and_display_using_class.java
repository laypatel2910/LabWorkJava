package lab_7;

import java.util.Scanner;

 class Student_Details {
    long Enrollment_No;
    String Student_Name;
    byte Semester;
    float CPI;
    float SPI;

    void GetStudentDetails (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Enrollment_No : ");
        Enrollment_No = sc.nextLong();
        System.out.println("Enter a Student_Name : ");
        Student_Name = sc.nextLine();
        Student_Name = sc.nextLine();
        System.out.println("Enter a Semester :");
        Semester = sc.nextByte();
        System.out.println("Enter a CPI : ");
        CPI = sc.nextFloat();
        System.out.println("Enter a SPI : ");
        SPI = sc.nextFloat();
    }
    void  DisplayStudentDetails (){
        System.out.println("Enrollment_No : " + Enrollment_No);
        System.out.println("Student_Name : " + Student_Name);
        System.out.println("Semester : " + Semester);
        System.out.println("CPI : " + CPI);
        System.out.println("SPI : " + SPI);
    }
}

public class Student_Details_get_and_display_using_class {
    public static void main(String[] args) {
        Student_Details s = new Student_Details();
        s.GetStudentDetails();
        s.DisplayStudentDetails();
    }
}
