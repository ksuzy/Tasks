package lesson5.hometask1;
/**
 Создать класс, описывающий банкомат.

 Банкомат задается тремя свойствами:
 - количеством купюр номиналом 20, 50 и 100.

 Сделать методы для добавления денег в банкомат.

 Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.

 При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.

 Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Atm {

    private static final int NOMINAL20 = 20;
    private static final int NOMINAL50 = 50;
    private static final int NOMINAL100 = 100;

    private int banknote20;
    private int banknote50;
    private int banknote100;

    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public boolean takeMoney (int sum) {  // 330 rubles
        if (sum > (banknote20 * NOMINAL20 + banknote50 * NOMINAL50 + banknote100 * NOMINAL100) ||
                sum < NOMINAL20 || sum % 10 != 0 || sum == 30) return false;
        int amountOf50 = 0;
        if ((sum / 10) % 2 != 0) {
            if (banknote50==0){
                return false;
            }
            sum -= NOMINAL50;
            amountOf50++;
            banknote50--;
        }
        int amountOf100 = sum / NOMINAL100;
        if (banknote100 >= amountOf100) banknote100 -= amountOf100;
        else {
            amountOf100 = banknote100;
            banknote100 -= banknote100;
        }
        sum -= amountOf100 * NOMINAL100;

        int amountOf50Additional = sum / NOMINAL50 % 2 == 0 ? sum / NOMINAL50 : sum / NOMINAL50 - 1;

        if (banknote50 >= amountOf50Additional) banknote50 -= amountOf50Additional;
        else {
            boolean evenBanknote50 = banknote50 % 2 == 0;
            amountOf50Additional = evenBanknote50 ? banknote50 : banknote50 - 1;
            banknote50 -= evenBanknote50 ? banknote50 : banknote50 - 1;
        }
        sum -= amountOf50Additional * NOMINAL50;

        int amountOf20 = sum / NOMINAL20;
        if (banknote20 >= amountOf20) banknote20 -= amountOf20;
        else {
            amountOf20 = banknote20;
            banknote20 -= banknote20;
        }
        sum -= amountOf20 * NOMINAL20;
        if (sum == 0) {
            System.out.println("100: " + amountOf100 + ", 50: " + (amountOf50 + amountOf50Additional) + ", 20: " + amountOf20 + ".");
            return true;
        }

        return false;
    }
    public void putBanknote20(int amount) {
        this.banknote20 += amount;
    }
    public void putBanknote50(int amount) {
        this.banknote50 += amount;
    }
    public void putBanknote100(int amount) {
        this.banknote100 += amount;
    }


}
