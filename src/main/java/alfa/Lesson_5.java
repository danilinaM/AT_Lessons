package alfa;

import java.time.LocalDate;
import java.util.Random;

public class Lesson_5 {
    public static void main(String[] args) {
        int minLength = 8;
        int seeds[] = {42, 77, 13};
        String prefix = "AGENT";

        String code = generateAccessCode();
        System.out.println(isValidCode(code, minLength));
        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);
        for (int seed : seeds) {
            System.out.println(generateAgentId(prefix, seed));
        }
    }

    public static String generateAccessCode() {
        StringBuilder accessCodeBuilder = new StringBuilder();
        String firstPart = String.valueOf(LocalDate.now().getYear());
        String secondPart = "-";
        String thirdPart = String.valueOf((int) (Math.pow(3, 7)));
        accessCodeBuilder.append(firstPart).append(secondPart).append(thirdPart);
        return accessCodeBuilder.toString();
    }

    private static boolean isValidCode(String code, int minLength) {
        return code != null && code.length() >= minLength && code.contains("-");
    }

    public static void logEvent(String message) {
        System.out.println("[INFO] " + message);
    }

    public static void logEvent(String message, boolean isCritical) {
        if (isCritical) {
            System.out.println("[CRITICAL] " + message);
        } else {
            logEvent(message);
        }
    }

    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt(1000, 10000);
        return (prefix + "-" + randomNumber);
    }
}
