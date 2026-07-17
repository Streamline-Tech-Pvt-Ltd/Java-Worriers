package rushi.main.constructorClass;

class Room {

    Room() {
        System.out.println("Room Created");
    }

    void display() {
        System.out.println("Room is inside the House");
    }
}

class House {

    private Room room;

    House() {
        room = new Room();   // Room object created inside House
    }

    void showHouse() {
        room.display();
        System.out.println("House is Ready");
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        House h = new House();

        h.showHouse();
    }
}