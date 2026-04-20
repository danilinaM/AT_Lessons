package alfa;

import java.util.Random;

public class Lesson_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt( 99);
        double sum = random.nextDouble(100000);
        boolean hasInvitation = false;
        boolean inBlackList = false;
        boolean reachMinAge = age >= 18;
        boolean hasEnoughMoneyOrInvite = sum > 50000 || hasInvitation;
        boolean canVisitMeeting = reachMinAge && hasEnoughMoneyOrInvite && (!inBlackList);
        double fee = sum * 0.075;
        System.out.println(
                        "Проход разрешен: " + canVisitMeeting + "\n" +
                        "Обязательный добровольный взнос: " + fee
        );
    }
}
