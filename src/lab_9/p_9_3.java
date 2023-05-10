/*
Create class student which contain enroll_no, name, marks, gender as instance variable and count
as static variable which stores the count of the objects. Use constructor to initialize variable and
display() method to display data
*/
package lab_9;

import java.util.Scanner;
class Student{
    long enroll_no;
    String name;
    byte marks;
    String gender;
    static int count;
    Student(long enroll_no,String name,byte marks,String gender){
        this.enroll_no = enroll_no;
        this.name = name;
        this.marks = marks;
        this.gender = gender;
        count ++;
    }
    void Display_Student_Details(){
        System.out.println("Enrollment_No : " + enroll_no);
        System.out.println("Student_Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Gender : " + gender);
        System.out.println("Number of Object : " + count);
    }
}
public class p_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Student Details You Enter : ");
        int Number_Of_Student = sc.nextInt();
        for(int i = 1;i<=Number_Of_Student;i++){
            System.out.println("Enter a Enrollment_No : ");
            long enroll_no = sc.nextLong();
            System.out.println("Enter a Student_Name : ");
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter a Marks :");
            byte marks = sc.nextByte();
            System.out.println("Enter a Gender : ");
            String gender = sc.next();
            Student s_i = new Student(enroll_no,name,marks,gender);
            System.out.println( i +"'s Student Details");
            s_i.Display_Student_Details();
        }
    }
}
