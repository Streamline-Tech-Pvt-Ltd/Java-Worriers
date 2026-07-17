package rushi.main.constructorClass;

class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

class Care {
    Engine engine;

    Care(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is Running");
    }
}

public class AggregationEngine {

    public static void main(String[] args) {

        Engine e = new Engine();   

        Care c = new Care(e);        

        c.drive();                 
    }
}

//main()
//|
//▼
//Engine e = new Engine();
//|
//▼
//Car c = new Car(e);
//|
//▼
//Constructor executes
//this.engine = engine;
//|
//▼
//Car now stores Engine reference
//|
//▼
//c.drive();
//|
//▼
//engine.start();
//|
//▼
//Engine Started
//Car is Running