package lab_7;

import java.util.Scanner;

class Add_Time {
    int hour;
    int minute;
    void get_value_of_hour_minute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hour : " );
        hour = sc.nextInt();
        System.out.println("Enter a minute : " );
        minute = sc.nextInt();
        while (minute >=60){
            System.out.println("You not entered more than 60 min please enter again: ");
            minute = sc.nextInt();
        }
    }
    void addition(Add_Time obj1, Add_Time obj_2){
        int Hour = obj1.hour + obj_2.hour;
        int Minute = obj1.minute + obj_2.minute;
        while (Minute >= 60){
            Minute -= 60;
            Hour++;
        }
        System.out.println("Hour : " + Hour);
        System.out.println("Minute : " + Minute);
    }
}
public class Time_class_with_hour_and_minute_add_two_time_objects {
    public static void main(String[] args) {
        Add_Time time_1 = new Add_Time();
        Add_Time time_2 = new Add_Time();
        time_1.get_value_of_hour_minute();
        time_2.get_value_of_hour_minute();
        time_2.addition(time_1,time_2);

    }
}
