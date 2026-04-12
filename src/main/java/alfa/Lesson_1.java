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
        System.out.println("Сотрудник: " + name + "\n" + "Должность: " + position + "\n" + "Оплата за смены: " + rate * amount + "\n" + "Премия: " + bonus
                + "\n" + "Штраф: " + fine + "\n" + "Итоговая зарплата: " + (rate * amount + bonus - fine) + "\n" + "Шаур-выручка: " + +price * count);
    }
}