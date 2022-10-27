package Day3_problems;

public class count_Frequency {
    public static void main(String[] args)
    {
            int arr[] = new int[]{10, 20, 20, 10, 5, 5, 5, 20};
            int n = arr.length;//8
            countFreq(arr, n);
        }
        public static void countFreq ( int arr[], int n){
            boolean visited[] = new boolean[n];

            System.out.println(visited.toString());
            //boolean b = false;
            // Traverse through array elements and
            // count frequencies
            for (int i = 0; i < n; i++) {
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
                System.out.println(arr[i] + " " + count);}
        }


    }
