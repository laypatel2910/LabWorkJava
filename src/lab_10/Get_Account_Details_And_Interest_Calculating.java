package lab_10;

import java.util.Scanner;

class account_details{
    Scanner sc = new Scanner(System.in);
    long account_number;
    String account_name;
    double account_balance;
    double interest_rate = 2.5;
    void get_information(){
        System.out.println("Enter a account number : ");
        account_number = sc.nextLong();
        System.out.println("Enter a account holder name : ");
        account_name = sc.nextLine();
        account_name = sc.nextLine();
        System.out.println("Enter a account balance : ");
        account_balance = sc.nextDouble();
    }
}
class interest_calculating_display extends account_details {
    void calculateInterest() {
        get_information();
        double total_interest = account_balance * (interest_rate/100);
        System.out.println("Total interest is : " + total_interest);
    }
}
public class Get_Account_Details_And_Interest_Calculating {
    public static void main(String[] args) {
        interest_calculating_display i_c_d = new interest_calculating_display();
        i_c_d.get_information();
        i_c_d.calculateInterest();

    }
}
