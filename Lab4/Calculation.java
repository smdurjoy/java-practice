package Lab4;

class CalculatedResult {
    float result;

    public void show(String type) {
        System.out.println(type+" Result is = "+result);
    }
}

class Subtraction extends CalculatedResult {
    Subtraction(float a, float b) {
        this.result = a-b;
    }
}

class Multiplication extends CalculatedResult {
    Multiplication(float a, float b) {
        this.result = a*b;
    }
}

class Division extends CalculatedResult {
    Division(float a, float b) {
        this.result = a/b;
    }
}

public class Calculation {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        System.out.println("Numbers are "+a+" and "+b);
        Subtraction s = new Subtraction(a, b);
        s.show("Subtraction");

        Multiplication m = new Multiplication(a, b);
        m.show("Multiplication");

        Division d = new Division(a, b);
        d.show("Division");
    }
}
