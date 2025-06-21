// NotFollowingIsp.java
public class NotFollowingIsp {
    public static void main(String[] args) {
        BearKeeper keeper = new BearCarer();
        keeper.washTheBear();
        keeper.feedTheBear();
        keeper.petTheBear();
    }
}

interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();  //Not everyone should be forced to implement this
}

class BearCarer implements BearKeeper {
    public void washTheBear() {
        System.out.println("Washing the bear...");
    }

    public void feedTheBear() {
        System.out.println("Feeding the bear...");
    }

    public void petTheBear() {
        System.out.println("😨 Petting the bear (not safe!)");
    }
}
