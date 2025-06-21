// FollowingOcp.java
public class FollowingOcp {
    public static void main(String[] args) {
        Guitar basicGuitar = new Guitar("Yamaha", "F310", 7);
        SuperCoolGuitarWithFlames flameGuitar = new SuperCoolGuitarWithFlames("Gibson", "Les Paul", 9, "Red");

        basicGuitar.displayDetails();
        flameGuitar.displayDetails();
    }
}

// Original Guitar class remains unchanged
class Guitar {
    private String make;
    private String model;
    private int volume;

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public void displayDetails() {
        System.out.println("Guitar: " + make + " " + model + " | Volume: " + volume);
    }
}

// Extended class for special guitar with flames
class SuperCoolGuitarWithFlames extends Guitar {
    private String flameColor;

    public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
        super(make, model, volume);
        this.flameColor = flameColor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Flame Color: " + flameColor);
    }
}
