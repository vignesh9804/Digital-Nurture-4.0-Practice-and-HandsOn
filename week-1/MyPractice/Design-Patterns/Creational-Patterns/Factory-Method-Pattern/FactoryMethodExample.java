// Interface
interface Juice {
    void prepare();
}

// Concrete class 1
class AppleJuice implements Juice {
    public void prepare() {
        System.out.println("Preparing Apple Juice");
    }
}

// Concrete class 2
class OrangeJuice implements Juice {
    public void prepare() {
        System.out.println("Preparing Orange Juice");
    }
}

// Factory class
class JuiceFactory {
    public Juice createJuice(String type) {
        if (type.equalsIgnoreCase("apple")) {
            return new AppleJuice();
        } else if (type.equalsIgnoreCase("orange")) {
            return new OrangeJuice();
        } else {
            throw new IllegalArgumentException("Unknown juice type: " + type);
        }
    }
}

// Main class
public class FactoryMethodExample {
    public static void main(String[] args) {
        JuiceFactory factory = new JuiceFactory();

        Juice juice1 = factory.createJuice("apple");
        juice1.prepare();  // Output: Preparing Apple Juice

        Juice juice2 = factory.createJuice("orange");
        juice2.prepare();  // Output: Preparing Orange Juice
    }
}
