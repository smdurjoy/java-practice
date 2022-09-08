
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer number: ");
            int n = sc.nextInt();
            System.out.println("Enter an double number: ");
            double m = sc.nextDouble();
            System.out.println("Integer number: "+n);
            System.out.println("Double number: "+m);
        } finally {
            sc.close();
        }
    }
}