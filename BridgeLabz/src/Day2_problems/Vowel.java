package Day2_problems;
import java.util.Scanner;
public class Vowel {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String val = sc.nextLine();

            switch (val) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(val + " is vowel");
                    break;
                default:
                    System.out.println(val + " is consonant");
            }
        }
    }


