package Day5_problems;
import java.util.Random;
public class PrintPercentage {
     public static void main(String[] args) {

            Random ran = new Random();
            int var = 1 + ran.nextInt(2);

            switch (var){
                case 1: System.out.println("Heads");break;
                default: System.out.println("Tails");break;
            }
        }
    }


