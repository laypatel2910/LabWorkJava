package lab_8;
class student{
    public int enrolment_no;
    public String name;
    public String gender;
    public int marks;
    student(int enrolment_no,String name,String gender,int marks) {
        this.enrolment_no = enrolment_no;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
    }
    public void display(){
        System.out.println("enrolment_no : "+ enrolment_no);
        System.out.println("name : "+ name);
        System.out.println("gender : "+ gender);
        System.out.println("marks : "+ marks);
    }
}
public class Student_Details_Display_using_class_And_Constructor {
    public static void main(String[] args) {
        student stu = new student(548671104 , "Name" ,"Gender",25 );
        stu.display();
    }
}
