package Day3_problems;
import java.util.Arrays;
public class SecondLargest {
        public static void main(String[] args) {
            int[] a = {11,22,33,44,45,46,48,55};

            Arrays.sort(a);

            System.out.println("Second largest number is "+ a[a.length-2]);
        }
    }


