package alfa;

import java.time.LocalDate;
import java.util.Random;

public class Lesson_5 {
    public static void main(String[] args) {
        String code = generateAccessCode();
        System.out.println(isValidCode(code, 8));
        logEvent("Server protection activated");
        logEvent("Intrusion attempt detected", true);
        System.out.println(generateAgentId("AGENT", 42));
        System.out.println(generateAgentId("AGENT", 77));
        System.out.println(generateAgentId("AGENT", 13));
    }

    public static String generateAccessCode() {
        StringBuilder strb = new StringBuilder();
        String firstPart = String.valueOf(LocalDate.now().getYear());
        String secondPart = "-";
        String thirdPart = String.valueOf((int) (Math.pow(3, 7)));
        strb.append(firstPart).append(secondPart).append(thirdPart);
        return strb.toString();
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

    private static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt(1000, 10000);
        return (prefix + "-" + randomNumber);
    }
}
