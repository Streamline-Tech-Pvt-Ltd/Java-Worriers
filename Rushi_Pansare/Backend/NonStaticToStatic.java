
package rushi.main.demo;

public class NonStaticToStatic {

    public static void main(String[] args) {
        System.out.println("This is first code");

        NonStaticToStatic obj = new NonStaticToStatic();
        obj.add(2, 3);
    }

    
    public void add(int x, int y) {
        System.out.println(x + y);
        display();  
    }

    public static void display() {
        System.out.println("This is static method");
    }
}