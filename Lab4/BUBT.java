package Lab4;

class User {
    String userName, password, name;
    int userType;

    public User(String userName, String password,
            String name, int userType) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.userType = userType;
    }

    public void login() {
        System.out.println(userName + " You are logged in\n" + 
                "Your type is "+ userType);
    }
    public void logout() {
        System.out.println(userName + " You are logged out. See you soon.");
        System.out.println("-----------------------------------------");
    }
}

class Student extends User {
    int ID,intake;
    String dept;

    public Student(String userName, String password,
            String name, int userType, int ID, int intake,
            String dept)
    {
        
        super(userName, password, name, userType);
       
        this.ID = ID;
        this.intake = intake;
        this.dept = dept;
    }
    
    public void courseReg()
    {
        System.out.println("Id: "+ID+"\nintake "+intake
                + "\nName: "+name + "\nUser Type "+userType);
    }
}

class Faculty extends User {
    String shortCode, dept, roomNo;
    public Faculty(String userName, String password, String name, 
            int userType, String shortCode, String dept, String roomNo)
    {
        
        super(userName, password, name, userType);
       
        this.shortCode = shortCode;
        this.dept = dept;
        this.roomNo = roomNo;
    }

    public void supervise() {
        System.out.println("Supervisor of intake 37.");
    }
}

class Admin extends User {
    String roomNo;
    public Admin(String userName, String password,
            String name, int userType, String roomNo)
    {
        
        super(userName, password, name, userType);
        this.roomNo = roomNo;
    }

    public void add() {
        System.out.println("User added successfully.");
    }

    public void delete() {
        System.out.println("User deleted successfully.");
    }
}

public class BUBT {
    public static void main(String[] args) {
        Student s1 = new Student("smdurjoy", "12345","Mr. DurJoy", 
                1, 002, 37, "CSE");
        s1.login();
        s1.courseReg();
        s1.logout();

        Faculty f1 = new Faculty("faculty", "12345","Mr. Faculty", 
        1, "SMD96", "CSE", "302");
        f1.login();
        f1.supervise();
        f1.logout();

        Admin a1 = new Admin("admin", "12345","Mr. Faculty", 
        1, "319");
        a1.login();
        a1.add();
        a1.delete();
        a1.logout();
    }
}