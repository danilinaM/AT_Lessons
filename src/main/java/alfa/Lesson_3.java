package alfa;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        String[] petyaBasket = {"курица", "бананы", "творог" };
        String[] kolyaBasket = {"курица", "бананы", "творог" };
        String[] terentiyBasket = {"пиво", "пельмени", "ласка магия черного" };
        String compareBasketSizePetyaKolya = petyaBasket.length == kolyaBasket.length ? "У Пети и Коли одинаковое количество товаров" : "У Пети и Коли разное количество товаров";
        String compareBasketSizePetyaTerentiy = petyaBasket.length == terentiyBasket.length ? "У Пети и Терентия одинаковое количество товаров" : "У Пети и Терентия разное количество товаров";
        String compareBasketContentPetyaKolya = Arrays.equals(petyaBasket, kolyaBasket) ? "У Пети и Коли одинаковые товары в корзине" : "У Пети и Коли разные товары в корзине";
        String compareBasketContentPetyaTerentiy = Arrays.equals(petyaBasket, terentiyBasket) ? "У Пети и Терентия одинаковые товары в корзине" : "У Пети и Терентия разные товары в корзине";
        System.out.println(compareBasketSizePetyaKolya + "\n" + compareBasketSizePetyaTerentiy + "\n" + compareBasketContentPetyaKolya + "\n" + compareBasketContentPetyaTerentiy);

        String[][] all = {petyaBasket, kolyaBasket, terentiyBasket};
        String longest = all[0][0];
        String shortest = all[0][0];
        int fullLength = 0;
        int count = 0;
        double avgLength;
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++) {
                if (all[i][j].length() > longest.length()) {
                    longest = all[i][j];
                }
                if (all[i][j].length() < shortest.length()) {
                    shortest = all[i][j];
                }
                fullLength += all[i][j].length();
                count++;
            }
        }
        avgLength = (double) fullLength / count;
        System.out.println("Товар с самым длинным названием : " + longest + "\n" + "Товар с самым коротким названием : " + shortest + "\n" + "Средняя длина названия : " + avgLength);

        String[] passwords = {"Qwerty", "1234567890", "Adhgfn)$*%23y" };
        boolean check = false;
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].length() > 8) {
                if (passwords[i].charAt(0) != '1') {
                    if (passwords[i].charAt(passwords[i].length() - 1) != 'z') {
                        if (!passwords[i].contains("qwerty")) {
                            if (!passwords[i].contains("1234")) {
                                check = true;
                            }
                        }
                    }
                }
            }
            System.out.println("Пароль '" + passwords[i].toString() + "' прошел проверку: " + check);
        }
    }
}
