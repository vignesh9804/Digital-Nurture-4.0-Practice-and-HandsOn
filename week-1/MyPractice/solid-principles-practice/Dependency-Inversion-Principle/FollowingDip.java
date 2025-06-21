// FollowingDip.java
public class FollowingDip {
    public static void main(String[] args) {
        Keyboard keyboard = new StandardKeyboard();
        Display monitor = new Monitor();

        Windows98Machine machine = new Windows98Machine(keyboard, monitor);
        machine.start();
    }
}

// Abstractions
interface Keyboard {
    void type();
}

interface Display {
    void display();
}

// High-level class depends on abstractions
class Windows98Machine {
    private final Keyboard keyboard;
    private final Display monitor;

    public Windows98Machine(Keyboard keyboard, Display monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void start() {
        System.out.println("Starting Windows 98 with:");
        keyboard.type();
        monitor.display();
    }
}

// Concrete implementations
class StandardKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing using Standard Keyboard");
    }
}

class Monitor implements Display {
    public void display() {
        System.out.println("Displaying on Monitor");
    }
}
