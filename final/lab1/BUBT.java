package lab1;

public class BUBT {
    public static void main(String[] args) {
        try {
            int due = 20500;
            double cgpa = 2.42;
            checkDue(due);
            checkCgpa(cgpa);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
    static void checkDue(int due) throws OverdueException {
        if (due > 20000) {
            throw new OverdueException("Please Pay Your Due!");
        }
    }
    static void checkCgpa(double cpga) throws LowCgpaException {
        if (cpga < 2.5) {
            throw new LowCgpaException("Meet your intake-incharge.");
        }
    }
}
