package alfa.lesson13;

import java.util.*;

public class SquadManager {

    protected void demonstareteListCreations() {
        ArrayList<String> main = new ArrayList<>() {{
            add("One");
            add("Two");
            add("Three");
            add("Four");
        }};
        List<String> reserve = Arrays.asList("Five", "Six", "Seven");
        List<String> elite = List.of("Eight", "Nine");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets add new name to main Array.");
        try {
            main.add(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("U cant add this element to Array");
        }

        System.out.println("Lets delete character from main array by index");
        try {
            main.remove(scanner.nextInt());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No such index in array");
        }

        System.out.println("Lets add new name to reserve Array.");
        scanner.nextLine();
        try {
            reserve.add(scanner.nextLine());
        } catch (UnsupportedOperationException e) {
            System.out.println("U cant add element to this Array");
        }

        try {
            System.out.println("Lets delete character from reserve Array by index");
            int index = scanner.nextInt();
            scanner.nextLine();
            reserve.remove(index);
        } catch (UnsupportedOperationException e) {
            System.out.println("U cant delete element from this Array");
        }
        try {
            System.out.println("Lets add new name to elite Array");
            elite.add(scanner.nextLine());
        } catch (UnsupportedOperationException e) {
            System.out.println("U cant add element to this Array");
        }
        try {
            System.out.println("Lets delete character from elite Array by index");
            int index = scanner.nextInt();
            scanner.nextLine();
            elite.remove(index);
        } catch (UnsupportedOperationException e) {
            System.out.println("U cant delete element from this Array");
        }
    }

    protected void filterOutCowards(List<String> squad) {
        System.out.println("До фильтрации: ");
        for (String s : squad) {
            System.out.println(s);
        }
        Iterator<String> iterator = squad.iterator();
        System.out.println("После фильтрации: ");
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("Трус")) {
                iterator.remove();
            }
        }
        System.out.println(squad.toString());
    }

    private void filterBonus(List<String> squad) {
        squad.removeIf(s -> s.startsWith("Трус"));
    }
}
