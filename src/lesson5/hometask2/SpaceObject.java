package lesson5.hometask2;

public abstract class SpaceObject implements Rotating, Calculable {

    private double volume;
    private double mass;
    private String name;

    protected SpaceObject(String name, double volume, double mass) {
        this.name = name;
        this.volume = volume;
        this.mass = mass;
    }

    @Override
    public String rotateAround(SpaceObject centreOfRotation) {
        return "I rotate around " + centreOfRotation.getName();
    }

    @Override
    public void rotate() {
        System.out.println("I'm spinning on my axis");
    }

    @Override
    public double calculateDiameter() {
        return Math.cbrt(this.volume * 6 / Math.PI);
    }

    @Override
    public void compareMass(SpaceObject spaceObject) {
        if (this.mass == spaceObject.getMass()) {
            System.out.println("The masses of the objects are equal");
        } else if (this.mass > spaceObject.getMass()) {
            System.out.println("The mass of " + this.name + " is larger than " + spaceObject.getName());
        } else {
            System.out.println("The mass of " + this.name + " is smaller than " + spaceObject.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "volume=" + volume +
                ", mass=" + mass +
                ", name='" + name + '\'' +
                '}';
    }
}
