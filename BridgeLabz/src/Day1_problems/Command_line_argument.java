package Day1_problems;

public class Command_line_argument {

    public static void main (String x[])
        {
            int n, cnt=0, sum=0;
            for(int i=0;i<x.length;i++)
            {
                try
                {
                    n=Integer.parseInt(x[i]);
                    sum= sum+n;
                }
                catch (NumberFormatException e)
                {
                    cnt++;
                }
            }
            System.out.println("Sum of only valid integers is= "+sum) ;

            System.out.println("Invalid integers are: "+cnt) ;
        }

    }


