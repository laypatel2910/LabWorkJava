package lab_7;


import java.util.Scanner;

class Bank_Account{
      private long Bank_Account_Number;
      private String User_Name;
      private String Email;
      private String Account_Type;
      private long Account_Balance ;
      void GetAccountDetails(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your Bank user name : ");
          User_Name = sc.nextLine();
          System.out.println("Enter your Bank account number : ");
          Bank_Account_Number = sc.nextLong();
          System.out.println("Enter your Bank email : ");
          Email = sc.nextLine();
          Email = sc.nextLine();
          System.out.println("Enter your Bank account type : ");
          Account_Type = sc.next();
          System.out.println("Enter your Bank account balance : ");
          Account_Balance = sc.nextLong();
      }
      void DisplayAccountDetails(){
          System.out.println("user name : " + User_Name);
          System.out.println("account number : " + Bank_Account_Number);
          System.out.println("email : " + Email);
          System.out.println("account type : " + Account_Type);
          System.out.println("account balance : " + Account_Balance);
      }
}
public class Bank_Account_Details_get_and_display_using_class {
    public static void main(String[] args) {
        Bank_Account bank = new Bank_Account();
        bank.GetAccountDetails();
        bank.DisplayAccountDetails();
    }
}
