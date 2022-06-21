public class Main {
    public static void main(String[] args) {

        // все начальные значения указываются в копейках
        int startingBalance = 10_000;
        int refillAmount = 110_000;
        float finalBalance;
        int bonus = 0;

        if (refillAmount > 100_000) {
            bonus = refillAmount / 10_000; // Расчет бонуса в рублях, потому что он целое число без копеек - Сумма пополнения / 100 рублей (10_000 копеек)
            finalBalance = (startingBalance + refillAmount) / 100 + bonus; // Стартовый баланс и сумма пополнения переводится в рубли + бонус уже в рублях
        } else {
            finalBalance = (startingBalance + refillAmount) / 100;
        }

        System.out.println("Итоговый баланс:  " + finalBalance + " рублей");
        System.out.println("Начисленные бонусы:  " + bonus + " рублей");
    }
}
