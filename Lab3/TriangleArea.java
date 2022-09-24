package Lab3;

class Area3 {
    float a,b,c;
    Area3() {
        a = 3;
        b = 4;
        c = 5;
    }
    public float area() {
        return 0.5f * a * c;
    }
    public float perimeter() {
        return a * b * c;
    }
}

public class TriangleArea {
    public static void main(String args[]) {
        Area3 a = new Area3();
        System.out.println("Area is = "+a.area());
        System.out.println("Perimeter is = "+a.perimeter());
    }
}
