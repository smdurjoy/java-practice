package Lab3;

class Rectangle {
    float a, b;
    Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    float area() {
        return a*b;
    }
}

public class RectangleArea {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("First rectangle area is = "+r.area());
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Second rectangle area is = "+r2.area());
    }
}
