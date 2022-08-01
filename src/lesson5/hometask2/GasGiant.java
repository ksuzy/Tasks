package lesson5.hometask2;

public class GasGiant extends Planet {

    private String atmosphere;
    int widthOfRings;

    public GasGiant(String name, double volume, double mass, Star centreOfSystem,
                    String atmosphere, int widthOfRings) {
        super(name, volume, mass, centreOfSystem);
        this.atmosphere = atmosphere;
        this.widthOfRings = widthOfRings;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public int getWidthOfRings() {
        return widthOfRings;
    }

    public void setWidthOfSolidRings(int widthOfSolidRings) {
        this.widthOfRings = widthOfSolidRings;
    }

    @Override
    public String toString() {
        return "GasGiant{" +
                "atmosphere='" + atmosphere + '\'' +
                ", widthOfRings=" + widthOfRings +
                '}';
    }
}
