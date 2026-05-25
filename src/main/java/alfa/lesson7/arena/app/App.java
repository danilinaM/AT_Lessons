package alfa.lesson7.arena.app;

import alfa.lesson7.arena.heroes.Archer;
import alfa.lesson7.arena.heroes.Hero;
import alfa.lesson7.arena.heroes.Knight;
import alfa.lesson7.arena.heroes.Mage;

public class App {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Aragorn", 1, 100, false),
                new Archer("Legolas", 10, 77, 1),
                new Mage("Gendalf", 100, 1, 1000000)
        };

        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
        }

        final Knight knight = new Knight("Borromir", 50, 2, true);
        System.out.println(knight.toString());
        knight.takeDamage(3);
        System.out.println(knight.toString());
    }
}
