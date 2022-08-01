package lesson5.hometask2;

public class WhiteDwarf extends Star {



    public WhiteDwarf(String name, double volume, double mass, int temperatureOfSurface) {
        super(name, volume, mass, temperatureOfSurface, "White");
    }

    @Override
    public void shine() {
        System.out.println("I'm shining with light and particles!");
    }
}
