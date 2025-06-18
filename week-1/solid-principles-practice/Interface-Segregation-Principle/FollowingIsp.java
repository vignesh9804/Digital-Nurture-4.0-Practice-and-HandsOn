// FollowingIsp.java
public class FollowingIsp {
    public static void main(String[] args) {
        BearCleaner cleaner = new BearCarer();
        BearFeeder feeder = new BearCarer();
        BearPetter daredevil = new CrazyPerson();

        cleaner.washTheBear();
        feeder.feedTheBear();
        daredevil.petTheBear();
    }
}

// Small interfaces
interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

interface BearPetter {
    void petTheBear();
}

// Carer only does safe things
class BearCarer implements BearCleaner, BearFeeder {
    public void washTheBear() {
        System.out.println("Washing the bear carefully...");
    }

    public void feedTheBear() {
        System.out.println("Feeding the bear safely...");
    }
}

// Crazy person does the dangerous part
class CrazyPerson implements BearPetter {
    public void petTheBear() {
        System.out.println("Petting the bear. Brave or foolish?");
    }
}
