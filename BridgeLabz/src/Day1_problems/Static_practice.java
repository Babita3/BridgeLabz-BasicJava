package Day1_problems;

public class Static_practice {
        static int x = 10; //static variable
        static int y;
        static void func(int z) //static method
        {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
        static // static block
        {
            System.out.println("Running static initialization block.");
            y = x + 5;
        }
        public static void main(String args[]) {
            func(8);
        }
    }

