package alfa.lesson13;

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayList<Alien> arrAlien = new ArrayList<>();
        arrAlien.addAll(List.of(
                new Alien("Shrek", "Mars", 4),
                new Alien("Shrek", "Mars", 9),
                new Alien("Rocky", "Adrian", 0),
                new Alien("Alf", "Melmak", 0),
                new Alien("Spock", "Vulkan", 6)
        ));
        checkDuplicate(arrAlien);

        SquadManager squadManager = new SquadManager();
        squadManager.demonstareteListCreations();

        ArrayList<String> cowards = new ArrayList<>(List.of("Петя", "Вася", "Иван", "Трус-Петя", "Трус Ваня"));
        squadManager.filterOutCowards(cowards);

        LinkedList<String> linkedList = new LinkedList<>(List.of("one", "two", "three", "four", "five"));
        AssaultQueue assaultQueue = new AssaultQueue(linkedList);
        assaultQueue.retreatCoward();
        assaultQueue.retreatCoward();
        assaultQueue.addRecruit("six");
        assaultQueue.addRecruit("seven");
        assaultQueue.addRecruit("eight");
        assaultQueue.printQueue();

        MissionReport missionReport = new MissionReport("Миссия разведка", arrAlien, 55);
        System.out.println(missionReport.toString());
        MissionReport m2 = new MissionReport("Миссия разведка", arrAlien, 5);
        System.out.println("Сравнение через знак '=' : " + (m2 = missionReport));
        System.out.println("Сравнение через 'equals' : " + (m2.equals(missionReport)));
    }

    private static void checkDuplicate(ArrayList<Alien> arr) {
        Set<Alien> set = new HashSet();
        for (Alien alien : arr) {
            set.add(alien);
        }
        if (arr.size() != set.size()) {
            System.out.println("Array have duplicates");
        } else {
            System.out.println("Array doesnt have duplicates");
        }
    }
}
