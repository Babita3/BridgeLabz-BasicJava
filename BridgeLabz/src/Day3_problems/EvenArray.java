package Day3_problems;

public class EvenArray {

        public static void main(String[] args) {
            int arrayA[]={1,2,7,8,3,2,310,70,600};
            evenArray(arrayA,arrayA.length);
        }
        public static int evenArray(int[] array, int total){
            int num;
            for (int i = 0; i < total; i++)
            {
                num = (i + 1) % 2;
                if (num == 0){
                    System.out.print(" " + array[i]);
                }
            }
            return array[total-1];
        }
    }

