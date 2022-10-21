package Day5_problems;

import java.util.Scanner;

public class Flipcoin_Percentage {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of coin flip");
            int count_Flip = sc.nextInt();
            int head = 0;
            int tail = 0;

            for(int i = 0; i<count_Flip; i++)
            {
                int flip = (int)(Math.random() *2);
                if(flip == 1) {
                    System.out.println("Head");
                    head += 1;
                }else
                {
                    System.out.println("Tail");
                    tail += 1;
                }

            }
            System.out.println("Total Number of Heads are " +head);
            double HeadPercentage = (head*100)/count_Flip;
            System.out.println("The head percentage is " +HeadPercentage);
            System.out.println("Total number of tails are " +tail);
            double TailPercentage = (tail*100)/count_Flip;
            System.out.println("The tail percentage is " +TailPercentage);

        }

    }

