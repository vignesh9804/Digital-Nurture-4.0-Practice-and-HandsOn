// NotFollowingOcp.java
public class NotFollowingOcp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Yamaha", "F310", 7, "Red");
        guitar.displayDetails();
    }
}

class Guitar {
    private String make;
    private String model;
    private int volume;
    private String flameColor; // New property added by modifying existing class

    public Guitar(String make, String model, int volume, String flameColor) {
        this.make = make;
        this.model = model;
        this.volume = volume;
        this.flameColor = flameColor;
    }

    public void displayDetails() {
        System.out.println("Guitar: " + make + " " + model + " | Volume: " + volume + 
                           " | Flame Color: " + flameColor);
    }
}
