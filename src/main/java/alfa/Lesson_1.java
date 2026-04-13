package alfa;

public class Lesson_1 {
    public static void main(String[] args) {
        String name = "Brad";
        String position = "Cook";
        int rate = 1000;
        int amount = 20;
        int bonus = 200;
        int fine = 50;
        int price = 300;
        int count = 99;

        int payment = rate * amount;
        int salary = payment + bonus - fine;
        int earnings = price * count;

        System.out.println("Сотрудник: " + name + "\n" + "Должность: " + position + "\n" + "Оплата за смены: " + payment + "\n" + "Премия: " + bonus
                + "\n" + "Штраф: " + fine + "\n" + "Итоговая зарплата: " + salary + "\n" + "Шаур-выручка: " + earnings);
    }
}