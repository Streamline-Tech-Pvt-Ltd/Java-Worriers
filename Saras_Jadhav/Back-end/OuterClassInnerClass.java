package streamlinetech.com.program;

public class OuterClassInnerClass {

    String name;

    OuterClassInnerClass(String name) {
        this.name = name;
    }

    // Inner class
    class Inner {

        String city, state;

        Inner(String city, String state) {
            this.city = city;
            this.state = state;
        }

        void display() {
            System.out.println("Student name: " + name);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
    }

    void show() {

        Inner addr = new Inner("Pune", "MH");

        System.out.println(addr.city);
        System.out.println(addr.state);
    }

    public static void main(String[] args) {

        OuterClassInnerClass Student =
                new OuterClassInnerClass("Rahul");

        OuterClassInnerClass.Inner addr =
                Student.new Inner("Delhi", "Delhi");

        addr.display();

        Student.show();
    }
}