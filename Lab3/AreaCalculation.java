package Lab3;

import java.util.Scanner;

class Area {
    float length, breadth;

    void setDim(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float getArea() {
        return length * breadth;
    }
}

public class AreaCalculation {
    public static void main(String args[]) {
        float length=0, breadth=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length = ");
        length = sc.nextFloat();
        System.out.print("Enter breadth = ");
        breadth = sc.nextFloat();
        sc.close();

        Area area = new Area();
        area.setDim(length, breadth);
        System.out.println("Area of the rectangle is = "+area.getArea());
    }
}
