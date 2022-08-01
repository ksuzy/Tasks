package lesson5.hometask1;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(50, 2, 1);
        System.out.println(atm.takeMoney(330));
    }
}
