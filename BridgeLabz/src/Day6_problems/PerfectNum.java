package Day6_problems;
import java.util.Scanner;
public class PerfectNum {
        public static void main(String[] args) {
            int n, sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            n = sc.nextInt();//6
            int i = 1;
            while (i <= n / 2) { //3
                if (n % i == 0) {
                    sum = sum + i;//1,3,6
                }
                i++;
            }
            if (sum == n) {
                System.out.println(n + " is a perfect number");
            } else
                System.out.println(n + " is not a perfect number");
        }

}

