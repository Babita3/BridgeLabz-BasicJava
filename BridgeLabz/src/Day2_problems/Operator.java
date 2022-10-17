package Day2_problems;
public class Operator {
    public static void demo(){
            System.out.println("Static method");
        }
        public void addition(){
            int a =10;
            int b = 11;
            int c = 12;
            int d = a+b*c;
            int e = c+a/b;

            System.out.println(""+d);
            System.out.println(""+e);
        }

        public static void main(String args[]){
            demo();

            Operator add = new Operator();
            add.addition();
        }
    }

