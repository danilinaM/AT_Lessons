package alfa;

public class Lesson_4_2 {
    public static void main(String[] args) {
        //Статус тестов
        String status = "";
        int all = 0;
        int critical = 0;
        int flaky = 0;
        int bug = 0;
        int pass = 0;
        StringBuilder stringBuilder = new StringBuilder();

        boolean showOnlyIssues = true;
        boolean stopIfManyCriticals = true;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                status = "Critical!";
                stringBuilder.append(status);
                critical++;
                if (critical >= 3 && stopIfManyCriticals) {
                    System.out.println("\n" + "\uD83D\uDEA8 Слишком много критических багов — будим тимлида!" + "\n");
                    break;
                } else {
                    System.out.printf("Тест #%d: " + status + "\n", i);
                }
            } else if (i % 3 == 0) {
                status = "Flaky";
                stringBuilder.append(status);
                flaky++;
                System.out.printf("Тест #%d: " + status + "\n", i);
            } else if (i % 5 == 0) {
                status = "Bug";
                stringBuilder.append(status);
                bug++;
                System.out.printf("Тест #%d: " + status + "\n", i);
            } else {
                status = "Pass";
                stringBuilder.append(status);
                pass++;
                if (!showOnlyIssues) {
                    System.out.printf("Тест #%d: " + status + "\n", i);
                }
            }
            all++;
        }
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====" + "\n" +
                "Всего тестов: " + all + "\n" +
                "Pass: " + pass + "\n" +
                "Flaky: " + flaky + "\n" +
                "Bug: " + bug + "\n" +
                "Critical: " + critical
        );
    }
}
