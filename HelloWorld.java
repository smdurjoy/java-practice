import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.println(a+b);
    }
}