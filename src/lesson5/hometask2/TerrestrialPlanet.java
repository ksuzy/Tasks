package lesson5.hometask2;

public class TerrestrialPlanet extends Planet {

    private String atmosphere;

    public TerrestrialPlanet(String name, double volume, double mass, Star centreOfSystem,
                    String atmosphere) {
        super(name, volume, mass, centreOfSystem);
        this.atmosphere = atmosphere;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    @Override
    public String toString() {
        return "TerrestrialPlanet{" + super.toString() +
                "atmosphere='" + atmosphere + '\'' +
                '}';
    }
}
