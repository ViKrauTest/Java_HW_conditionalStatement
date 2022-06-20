public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int refillAmount = 1100;
        int finalBalance;
        int bonus = 0;

        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
            finalBalance = startingBalance + refillAmount + bonus;
        } else {
            finalBalance = startingBalance + refillAmount;
        }

        System.out.println("Итоговый баланс  " + finalBalance);
        System.out.println("Начисленные бонусы  " + bonus);
    }
}
