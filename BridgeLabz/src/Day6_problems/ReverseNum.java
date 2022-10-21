package Day6_problems;
import java.util.Scanner;
public class ReverseNum {

   public static void main(String args[])
        {
            int num=0;
            int reversenum =0;
            System.out.println("Enter a Number: ");//123
            //input
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt(); //10
            System.out.print("Reverse of input number is: ");
            //While Loop: Logic to find out the reverse number
            while( num != 0 )//first value = 10, second value = 1
            {
                reversenum = reversenum * 10;//0*10// 0*1
                reversenum = reversenum + num%10;//0+(10%10=0)//0+(1%10=1)
                num = num/10;//10/10 = 1//1/10 = 0.1(jvm will round the value by excluding values after dot.)
                System.out.print(reversenum);
            }

        }
}

