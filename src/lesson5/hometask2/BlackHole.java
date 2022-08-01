package lesson5.hometask2;

public class BlackHole extends Star {



    public BlackHole(String name, double volume, double mass, int temperatureOfSurface) {
        super(name, volume, mass, temperatureOfSurface, "Black");
    }

    @Override
    public void shine() {
        System.out.println("I'm not shining! I'm Hole! Black Hole!");
    }

    @Override
    public String toString() {
        return "BlackHole{}";
    }
}

