package rushi.main.constructorClass;

class Demoe {

    Demoe() {
        this(10);   // Calls parameterized constructor
        System.out.println("Default Constructor");
    }

    Demoe(int a) {
        System.out.println("Parameterized Constructor");
        System.out.println("Value = " + a);
    }

    public static void main(String[] args) {
        Demoe d = new Demoe();
    }
}