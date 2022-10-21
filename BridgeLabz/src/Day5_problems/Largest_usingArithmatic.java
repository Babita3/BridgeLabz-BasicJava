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

    public static class count_Frequency {
            public static void countFreq(int arr[], int n)
            {
                boolean visited[] = new boolean[n];

                count_Frequency.fill(visited, false);

                // Traverse through array elements and
                // count frequencies
                for (int i = 0; i < n; i++) {

                    // Skip this element if already processed
                    if (visited[i] == true)
                        continue;

                    // Count frequency
                    int count = 1;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] == arr[j]) {
                            visited[j] = true;
                            count++;
                        }
                    }
                    System.out.println(arr[i] + " " + count);
                }
            }

            private static void fill(boolean[] visited, boolean b) {
            }

            // Driver code
            public static void main(String []args)
            {
                int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
                int n = arr.length;
                countFreq(arr, n);
            }
        }
}

