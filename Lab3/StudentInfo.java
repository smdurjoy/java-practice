package Lab3;

class Student3 {
    String name;
    int roll_no;
    
    public void setName(String n) {
        name = n;
    }
    public void setRollNo(int r) {
        roll_no = r;
    }
    public void printInfo() {
        System.out.println("Student name is "+name+" and roll no is "+roll_no);
    }
}

public class StudentInfo {
    public static void main(String args[]) {
        Student3 s = new Student3();
        s.setName("John");
        s.setRollNo(2);
        s.printInfo();
    }
}