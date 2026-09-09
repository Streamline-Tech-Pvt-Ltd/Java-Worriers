package streamlinetech.com.program;

interface Payment {

    void pay();   

    default void printReceipt() {
        System.out.println("Default Receipt...");
    }
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid via UPI");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Paid via Card");
    }
}

class CashPayment implements Payment {
    public void pay() {
        System.out.println("Paid via Cash");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {

        Payment obj1 = new UpiPayment();
        Payment obj2 = new CardPayment();
        Payment obj3 = new CashPayment();

        obj1.pay();
        obj1.printReceipt();

        obj2.pay();
        obj2.printReceipt();

        obj3.pay();
        obj3.printReceipt();
    }
}