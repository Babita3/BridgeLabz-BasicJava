package Day5_problems;
import java.util.Scanner;
public class Swap_num {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st element");
            int a = sc.nextInt();

            System.out.println("Enter 2nd element");
            int b = sc.nextInt();
            int temp = 0;
            temp = a;
            a = b;
            b = temp;

            System.out.println("Number 1 is :" + a);
            System.out.println("Number 2 is :" + b);

        }

    }


