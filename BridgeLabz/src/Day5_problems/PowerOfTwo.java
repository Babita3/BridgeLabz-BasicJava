package Day5_problems;

import java.util.Arrays;

public class PowerOfTwo
{

        public static void main (String args[])
        {
            int n = 1;
            int parse = Integer.parseInt(args[0]);

            if (0<=parse && parse<31){
                for(int i=0;i<parse;i++) {
                    int var = 2;
                    n *= var;
                }
                System.out.println("Power of 2 = "+ n ) ;
            } else {
                System.out.println("Memory out of bound") ;
            }

        }

    public static class SecondLargest {
        public static void main(String[] args) {
                int[] a = {11,22,33,44,45,46,48,55};

                Arrays.sort(a);

                System.out.println("Second largest number is "+ a[a.length-2]);
            }
        }
}

