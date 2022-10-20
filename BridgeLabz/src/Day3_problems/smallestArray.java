package Day3_problems;
public class smallestArray {
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

