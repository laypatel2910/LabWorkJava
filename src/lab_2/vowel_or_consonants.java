package lab_2;

import java.util.Scanner;

public class vowel_or_consonants
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char character = sc.next().charAt(0);
        if (character == 'a'||character == 'e'||character == 'i'||character == 'o'||character == 'u')
        {
            System.out.println(character + " is vowel");
        }
        else if (character == 'A'||character == 'E'||character == 'I'||character == 'O'||character == 'U')
        {
            System.out.println(character + " is vowel");
        }
        else
        {
            System.out.println(character + " is consonants");
        }

    }
}
