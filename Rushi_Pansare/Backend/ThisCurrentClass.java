package rushi.main.constructorClass;

class ThisCurrentClass {
    int rollNo;
    String name;

    // Default Constructor
    ThisCurrentClass() {
        this(101, "Rushikesh");   // Calls parameterized constructor
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    ThisCurrentClass(int r, String n) {
        rollNo = r;
        name = n;
        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    	ThisCurrentClass s1 = new ThisCurrentClass();
        s1.display();
    }
}





















