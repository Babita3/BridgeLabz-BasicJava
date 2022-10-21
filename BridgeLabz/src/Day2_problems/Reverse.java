package Day2_problems;
import java.util.Scanner;
public class Reverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt(), reverse = 0;

            while(num != 0) {
                int reverseValue = num % 10;
                reverse = reverse*10 + reverseValue;
                num = num/10;
            }

            System.out.println("the reversed number: "+ reverse);
        }
    }


