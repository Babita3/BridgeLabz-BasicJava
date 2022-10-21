package Day5_problems;
import java.util.Scanner;
public class CountFrequency {
    public static void main(String[] args)
    {
            int[] input = { 10, 20, 11, 22, 55, 10, 20, 80, 10, 80 };
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to check the frequency: ");
            int a = sc.nextInt();
            int result = CountFrequency.frequncychecker(a, input);
            System.out.println("the frequency of the number " + a + " is " + result);
    }
    public static int frequncychecker(int a, int[] input) {

            int count = 0;
            for (int i = 0; i < input.length; i++) {
                if (a == input[i]) {
                    count++;
                }
            }
            return count;
        }
    }