package lesson5.hometask2;

public final class SpaceUtils {

    public final static double GRAVITY_CONSTANT = 0.0000000000667;

    private SpaceUtils() {
    }

    static void gravityForce(SpaceObject spaceObject1, SpaceObject spaceObject2, double distanceBetweenObjects) {
    double result = GRAVITY_CONSTANT * spaceObject1.getMass() * spaceObject2.getMass() / Math.pow(distanceBetweenObjects, 2);
        System.out.println("The force of gravity is " + result);
    }

    static boolean isStar(SpaceObject spaceObject) {
        String[] nameOfClass = spaceObject.getClass().toString().split("\\.");
        System.out.println(spaceObject instanceof Star ? "I'm a star!" : "I'm not a star! I'm a " + nameOfClass[nameOfClass.length - 1] + "!!!");
        return spaceObject instanceof Star;
    }
}
