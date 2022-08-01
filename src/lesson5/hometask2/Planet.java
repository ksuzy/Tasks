package lesson5.hometask2;

public class Planet extends SpaceObject {

    private Star centreOfSystem;

    protected Planet(String name, double volume, double mass, Star centreOfSystem) {
        super(name, volume, mass);
        this.centreOfSystem = centreOfSystem;
    }


    @Override
    public String rotateAround() {
        return "I'm a planet and " + super.rotateAround(centreOfSystem);
    }


    public Star getCentreOfSystem() {
        return centreOfSystem;
    }

    public void setCentreOfSystem(Star centreOfSystem) {
        this.centreOfSystem = centreOfSystem;
    }

    @Override
    public String toString() {
        return "Planet{" + super.toString() +
                "centreOfSystem=" + centreOfSystem +
                '}';
    }
}
