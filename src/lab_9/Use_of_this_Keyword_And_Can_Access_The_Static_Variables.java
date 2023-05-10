package lab_9;

import java.util.Scanner;
class Use_of_this_Keyword {
    static byte age = 11;
    Use_of_this_Keyword(byte age){
        this.age = age;
    }
    void display(){
        System.out.println("Your age is : " + age);
    }
}

public class Use_of_this_Keyword_And_Can_Access_The_Static_Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        byte age = sc.nextByte();
        Use_of_this_Keyword n = new Use_of_this_Keyword(age);
        n.display();
    }
}
