package Day3_problems;

public class Array_largest_Element {
    public static void main(String[] args) {
        int arrayX[]={12,24,36,48,62,990,450,550,50};
        System.out.println("Largest: "+countLargestNum(arrayX, arrayX.length)); //arguments are intialized.
    }
    public static int countLargestNum(int[] array, int total){ //arguments are placed.
        int ar;
        for (int i = 0; i < total; i++)
        {//12
            for (int j = i + 1; j < total; j++)
            {
                if (array[i] >array[j])
                {
                    ar =array[i];
                    array[i] = array[j];
                    array[j] = ar;
                }
            }
        }
        return array[total-1];
    }

}
