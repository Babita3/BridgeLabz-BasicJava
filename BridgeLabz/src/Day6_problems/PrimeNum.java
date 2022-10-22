package Day6_problems;
import java.util.Scanner;
public class PrimeNum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int temp = 0;
        //Starting i=2 as 1 is not a prime number
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {//7%2
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println("The number is prime");
            } else
                System.out.println("The number is not prime");

        }

    }

