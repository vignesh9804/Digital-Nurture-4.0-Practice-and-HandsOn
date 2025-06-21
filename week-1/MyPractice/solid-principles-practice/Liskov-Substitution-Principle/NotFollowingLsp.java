// NotFollowingLsp.java
public class NotFollowingLsp {
    public static void main(String[] args) {
        Car car1 = new MotorCar(new Engine());
        car1.turnOnEngine();
        car1.accelerate();

        Car car2 = new ElectricCar();
        car2.turnOnEngine();  // Boom! Throws error
        car2.accelerate();
    }
}

// Car interface assumes every car has an engine
interface Car {
    void turnOnEngine();
    void accelerate();
}

class Engine {
    public void on() {
        System.out.println("Engine is now ON");
    }

    public void powerOn(int amount) {
        System.out.println("Powering with " + amount + " watts");
    }
}

class MotorCar implements Car {
    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    public void turnOnEngine() {
        engine.on();
    }

    public void accelerate() {
        engine.powerOn(1000);
    }
}

class ElectricCar implements Car {
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!"); // We should not write like this
    }

    public void accelerate() {
        System.out.println("Zooming silently...");
    }
}
