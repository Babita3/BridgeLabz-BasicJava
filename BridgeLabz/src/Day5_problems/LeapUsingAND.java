package Day5_problems;
import java.util.Scanner;
public class LeapUsingAND {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the year");
            int Year = sc.nextInt();
            if (((Year % 4 == 0) && (Year % 100== 0)) || (Year%400 == 0))
            {
                System.out.println("The year is a leap Year");
            }else
                System.out.println("THe year is not a leap year");

        }

    public static class HarmonicNumber {
        // this is a main function
            public static void main(String args[])
            {
                int num = 5;
                double result = 0.0;
                System.out.println("The harmonic series is: ");

                while (num > 0) {
                    result = result + (double)1 / num;
                    num--;
                    System.out.print(result + ", ");
                }
            }
        }

    public static class smallestArray {
        public static void main(String[] args) {
                int arrayX[]={12,24,36,48,62,990,450,550,50};

                System.out.println("Largest: "+countSmallestNum(arrayX,arrayX.length));
        }

        public static int countSmallestNum(int[] array, int total){
            int cal;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (array[i] <array[j])
                    {
                        cal =array[i];
                        array[i] = array[j];
                        array[j] = cal;
                    }
                }
            }
            return array[total-1];
        }
    }

    public static class DuplicateArray {
        public static void main(String[] args) {

                char arr[] = {'a', 'f', 'c' , 'b' , 'e' , 'f' , 'a' , 'b'};

                System.out.println("Duplicate elements in given array: ");

                for(int i = 0; i < arr.length; i++) {
                    for(int j = i + 1; j < arr.length; j++) {
                        if(arr[i] == arr[j]) {
                            System.out.println(arr[j]);
                        }
                    }
                }
            }
        }
}

