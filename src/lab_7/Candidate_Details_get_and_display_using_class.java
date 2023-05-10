package lab_7;

import java.util.Scanner;

class Candidate {
    public int Candidate_ID;
    public String Candidate_Name;
    public int Candidate_Age;
    public double Candidate_Weight;
    public double Candidate_Height;

    public void GetCandidateDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Candidate_ID :");
        Candidate_ID = sc.nextInt();
        System.out.println("Enter a Candidate_Name :");
        Candidate_Name = sc.nextLine();
        Candidate_Name = sc.nextLine();
        System.out.println("Enter a Candidate_Age :");
        Candidate_Age = sc.nextInt();
        System.out.println("Enter a Candidate_Weight :");
        Candidate_Weight = sc.nextDouble();
        System.out.println("Enter a Candidate_Height :");
        Candidate_Height = sc.nextDouble();
    }
    public void DisplayCandidateDetails(){
        System.out.println("Candidate_ID :" + Candidate_ID);
        System.out.println("Candidate_Name :" + Candidate_Name);
        System.out.println("Candidate_Age :" + Candidate_Age);
        System.out.println("Candidate_Weight :" + Candidate_Weight);
        System.out.println("Candidate_Height :" + Candidate_Height);
    }
}
public class Candidate_Details_get_and_display_using_class {
    public static void main(String[] args) {
        Candidate c = new Candidate();
        c.GetCandidateDetails();
        c.DisplayCandidateDetails();
    }
}
