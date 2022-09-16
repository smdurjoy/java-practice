package Lab3;

class Student {
    int roll;
    String name, address, phone;

    Student(String n) {
        name = n;
    }
    public void setPhone(String p) {
        phone = p;
    }
    public void setRoll(int r) {
        roll = r;
    }
    public void setAddress(String a) {
        address = a;
    }
    public void printInfo() {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone No : "+phone);
        System.out.println("Roll No : "+roll);
        System.out.println("----------------------");
    }
}

public class StudentInfo2 {
    public static void main(String args[]) {
        Student sam = new Student("Sam");
        sam.setPhone("01888888888");
        sam.setRoll(2);
        sam.setAddress("Dhaka");
        sam.printInfo();

        Student john = new Student("John");
        john.setPhone("01777777777");
        john.setRoll(5);
        john.setAddress("Rangpur");
        john.printInfo();
    }
}