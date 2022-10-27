package Day1_problems;
public class Command_line_argument {
    public static void main (String x[]) {
        int n, cnt = 0, sum = 0;
        for (int i = 0; i < x.length; i++) {
            try {
                n = Integer.parseInt(x[i]);

                for (int j = 0; j < x.length; j++) {
                    try {
                        n = Integer.parseInt(x[j]);//converting string value to int by using parse

                        sum = sum + n;
                    } catch (NumberFormatException e) {
                        cnt++;
                    }
                }
                System.out.println("Sum of only valid integers is= " + sum);

                System.out.println("Invalid integers are: " + cnt);
            }
            catch (Exception ex){

            }

        }
    }
}

