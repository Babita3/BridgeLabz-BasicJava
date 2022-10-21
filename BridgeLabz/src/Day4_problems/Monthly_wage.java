package Day4_problems;

public class Monthly_wage {
    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_hrs = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        //variables
        int empHrs = 0;
        int empWage = 0;
        int totalEdge = 0;
        //compution
        for (int day = 0; day<NUM_OF_WORKING_DAYS; day++)
        {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3; // 0 1 2
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_hrs;
        totalEdge += empWage;
        System.out.println("Emp Wage: " + empWage);
    }
        System.out.println("totalEdge: "+totalEdge);
}
}

