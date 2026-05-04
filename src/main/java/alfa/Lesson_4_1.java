package alfa;

import java.util.Scanner;

public class Lesson_4_1 {
    public static void main(String[] args) {
        //Вывод послания
        StringBuilder sb = new StringBuilder();
        String str = "";
        Scanner sc = new Scanner(System.in);
        int x = 5;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Введите %d часть сообщения\n", (i + 1));
            str = sc.nextLine();
            if (str.equalsIgnoreCase("NULL")) {
                sb.append("XX");
            } else {
                sb.append(str);
            }
            if (i != 4) {
                sb.append("#");
            }
        }
        System.out.println("Расшифрованное послание: " + sb.toString());
    }
}
