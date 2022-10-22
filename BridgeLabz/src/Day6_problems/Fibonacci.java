package Day6_problems;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt(); //5
            int x = 0;
            int y = 1;
            int count = 0;
            int i = 0;
             while (i < num) {
                 count = x + y;//1,3,5
                 System.out.println(count);//1
                 x = y; //1,2,3
                 y = count;//1,3,
                 i++;//1
             }
        }

    }

