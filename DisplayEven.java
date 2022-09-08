
import java.util.*;
public class DisplayEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            System.out.println("Even numbers from 1 to "+n);
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } finally {
            sc.close();
        }
    }
}
