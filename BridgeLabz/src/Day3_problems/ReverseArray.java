package Day3_problems;
import java.util.*;
public class ReverseArray {

        public static void main(String[] args) {

            int [] ar = {1,2,3,4,5,6,7,8,9};
            System.out.print("Elements of the arrays are " );

            for (int i = ar.length-1; i>=0; i--){
                System.out.print(" " + ar[i]);
            }
        }
    }