package lesson5.hometask2;

public class SpaceRunner {
    public static void main(String[] args) {

        Star blackHole = new BlackHole("Centre of Milky Way", 14400000, 14400000, 1200000);
        Star sun = new Star("Sun", 600000, 600000, 6000, "White");
        Star neutronStar = new NeutronStar("Neutron", 700000, 1200000, 30000, "Blue", 2000);
        Planet earth = new TerrestrialPlanet("Earth", 184000, 5000, sun, "O2, N2");
        Planet pluto = new DwarfPlanet("Pluto", 184000, 5000, sun);
        Planet jupiter = new GasGiant("Jupiter", 400000, 12000, sun, "CO2, N2", 1000000);

        System.out.println(earth.rotateAround());
        pluto.rotate();
        System.out.println(jupiter.rotateAround());
        System.out.println(sun.getColor());
        System.out.println(sun.rotateAround(blackHole));
        sun.shine();
        sun = sun.explode();
        sun.rotate();
        sun.shine();
        neutronStar.shine();
        System.out.println();
        System.out.println(earth);
        System.out.println();
        earth.compareMass(sun);
        earth.compareMass(pluto);
        System.out.println(earth.calculateDiameter());
        SpaceUtils.gravityForce(earth, sun, 144000000);
        SpaceUtils.isStar(sun);
        SpaceUtils.isStar(jupiter);
    }
}
