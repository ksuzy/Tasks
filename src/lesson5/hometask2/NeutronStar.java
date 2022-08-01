package lesson5.hometask2;

public class NeutronStar extends Star {

    private int widthOfSolidShell;

    public NeutronStar(String name, double volume, double mass, int temperatureOfSurface, String color, int widthOfSolidShell) {
        super(name, volume, mass, temperatureOfSurface, color);
        this.widthOfSolidShell = widthOfSolidShell;
    }

    @Override
    public void shine() {
        System.out.println("I'm shining only with light!");
    }

    public int getWidthOfSolidShell() {
        return widthOfSolidShell;
    }

    public void setWidthOfSolidShell(int widthOfSolidShell) {
        this.widthOfSolidShell = widthOfSolidShell;
    }
}
