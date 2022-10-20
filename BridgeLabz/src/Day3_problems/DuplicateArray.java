package Day3_problems;

public class DuplicateArray {
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

