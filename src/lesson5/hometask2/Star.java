package lesson5.hometask2;

public class Star extends SpaceObject implements Luminous {

    private int temperatureOfSurface;
    private String color;
    private static final int NUMBER_OF_EVOLUTIONS = 3;

    protected Star(String name, double volume, double mass, int temperatureOfSurface, String color) {
        super(name, volume, mass);
        this.temperatureOfSurface = temperatureOfSurface;
        this.color = color;
    }


    @Override
    public void shine() {
        System.out.println("I shine bright like a diamond!");
    }

    @Override
    public String rotateAround(SpaceObject centreOfRotation) {
        return "I'm a star and " + super.rotateAround(centreOfRotation);
    }

    @Override
    public String rotateAround() {
        return "I'm a star and " + super.rotateAround(this);
    }

    @Override
    public void rotate() {
        System.out.print("I'm a star and ");
        super.rotate();
    }

    Star explode() {
        switch ((int)(Math.random() * NUMBER_OF_EVOLUTIONS)) {
            case 0 -> {
                System.out.println("I exploded and evolved into a white dwarf!");
            return new WhiteDwarf(this.getName(),this.getVolume() / 1000, this.getMass(),
                    temperatureOfSurface * 100);}
            case 1 -> {
                System.out.println("I exploded and evolved into a neutron star!");
                return new NeutronStar(this.getName(),this.getVolume() / 1000, this.getMass(),
                        temperatureOfSurface * 100, "Blue", 2000);}
            case 2 -> {
                System.out.println("I exploded and evolved into a black hole!");
                return new BlackHole(this.getName(),this.getVolume() / 1000, this.getMass(),
                        temperatureOfSurface * 100);}
            default -> {
                System.out.println("Unsuccessful explosion... Shit");
                return this;
            }
        }
    }



    public int getTemperatureOfSurface() {
        return temperatureOfSurface;
    }

    public void setTemperatureOfSurface(int temperatureOfSurface) {
        this.temperatureOfSurface = temperatureOfSurface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
