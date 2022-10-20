package Day5_problems;
import java.util.Scanner;
public class Largest_usingArithmatic {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1st number");
            int a = sc.nextInt();

            System.out.println("Enter 2nd number");
            int b = sc.nextInt();

            System.out.println("Enter 3rd number");
            int c = sc.nextInt();

            if (a > b && a > c){
                System.out.println( a + " is grater than " + b +  " and " + c);
            } else if (b > c && b > c) {

                System.out.println(b + " is grater than " + a +  " and " + c);
            }else
                System.out.println(c + " is grater than " + a +  " and " + b);

            sc.close();
        }

    }

