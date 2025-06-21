// NotFollowingDip.java
public class NotFollowingDip {
    public static void main(String[] args) {
        Windows98Machine machine = new Windows98Machine();
        machine.start();
    }
}

class Windows98Machine {
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        keyboard = new StandardKeyboard(); //Directly creating dependencies
        monitor = new Monitor();
    }

    public void start() {
        System.out.println("Starting Windows 98 with:");
        keyboard.type();
        monitor.display();
    }
}

class StandardKeyboard {
    public void type() {
        System.out.println("Typing using Standard Keyboard");
    }
}

class Monitor {
    public void display() {
        System.out.println("Displaying on Monitor");
    }
}
