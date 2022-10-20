package Day5_problems;
import java.util.Scanner;
public class PrintVowelConsonant {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any alphabet");
            char ch = sc.next().charAt(0);

            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("The alphabet is a vowel");
            }else
                System.out.println("The number is a consonant");

        }

    }

