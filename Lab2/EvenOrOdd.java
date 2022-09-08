package Lab2;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println("Given string is "+checkNum(str));
        sc.close();
    }

    static String checkNum(String str) {
        if (str.length() % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
