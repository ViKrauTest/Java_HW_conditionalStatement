public class Main {
    public static void main(String[] args) {

        // все начальные значения указываются в копейках
        int startingBalance = 10000;
        int refillAmount = 110000;
        float finalBalance;
        int bonus = 0;

        if (refillAmount > 100000) {
            bonus = refillAmount / 10000;
            finalBalance = (startingBalance + refillAmount) / 100 + bonus;
        } else {
            finalBalance = (startingBalance + refillAmount) / 100;
        }

        System.out.println("Итоговый баланс:  " + finalBalance + " рублей");
        System.out.println("Начисленные бонусы:  " + bonus + " рублей");
    }
}
