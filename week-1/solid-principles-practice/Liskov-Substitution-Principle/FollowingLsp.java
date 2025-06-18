// FollowingLsp.java
public class FollowingLsp {
    public static void main(String[] args) {
        Car motorCar = new MotorCar(new Engine());
        motorCar.accelerate();

        Car electricCar = new ElectricCar();
        electricCar.accelerate();
    }
}

// General car can always accelerate
interface Car {
    void accelerate();
}

// Only engine-powered cars implement this
interface EnginePowered {
    void turnOnEngine();
}

class Engine {
    public void on() {
        System.out.println("Engine is now ON");
    }

    public void powerOn(int amount) {
        System.out.println("Powering with " + amount + " watts");
    }
}

class MotorCar implements Car, EnginePowered {
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
    public void accelerate() {
        System.out.println("Accelerating silently with electric power...");
    }
}
