package Lab3;

class Area2 {
    float a,b,c;
    Area2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float area() {
        return 0.5f * a * c;
    }
    public float perimeter() {
        return a * b * c;
    }
}

public class TriangleArea2 {
    public static void main(String args[]) {
        Area2 a = new Area2(3, 4, 6);
        System.out.println("Area is = "+a.area());
        System.out.println("Perimeter is = "+a.perimeter());
    }
}
