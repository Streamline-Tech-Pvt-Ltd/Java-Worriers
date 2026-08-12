package streamlinetech.com.program;

class Tests {

    static void CheckNumber(int num) {

        if (num < 0) {
            throw new ArithmeticException("Negative number");
        } 
        else {
            System.out.println("Valid number");
        }
    }
}

public class ThrrowMethod {

    public static void main(String[] args) {

        Tests.CheckNumber(-5);

    }
}