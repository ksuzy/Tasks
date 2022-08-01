package lesson5.hometask2;

public class DwarfPlanet extends Planet {
    protected DwarfPlanet(String name, double volume, double mass, Star centreOfSystem) {
        super(name, volume, mass, centreOfSystem);
    }

    @Override
    public String toString() {
        return "DwarfPlanet{}";
    }
}
