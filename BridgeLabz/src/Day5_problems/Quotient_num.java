package Day5_problems;

import java.util.Scanner;

public class Quotient_num {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numerator");
            double a = sc.nextDouble();

            System.out.println("Enter the Denominator");
            double b = sc.nextDouble();

            double quotient = a/b;
            double reminder = a%b;

            System.out.println("The Quotient is :" + quotient);
            System.out.println("The Reminder is " + reminder);

        }

    }
