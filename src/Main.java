public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных и параметров программы
        int initialBalance = 100; // Начальный баланс на счету клиента
        int topUpAmount = 1100; // Сумма пополнения
        //int topUpAmount = 100;// Сумма пополнения

        // Рассчитываем итоговый баланс и бонус
        int totalBalance = initialBalance + topUpAmount;
        int bonus;

        // Условный оператор для расчёта бонуса
        if (topUpAmount > 1000) {
            bonus = (topUpAmount / 100);
        } else {
            bonus = 0;
        }

        // Выводим результат на экран
        System.out.println("Итоговый баланс: " + (totalBalance + bonus));
    }
}
