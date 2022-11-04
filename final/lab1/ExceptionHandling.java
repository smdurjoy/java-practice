package lab1;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int arr[] = {2, 3};

            if (arr[5] == 6) {
                System.out.println("6 times champion!");
            }

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Something Went Wrong!");
            e.printStackTrace();
        }
    }
}
