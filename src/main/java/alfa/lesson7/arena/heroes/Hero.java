package alfa.lesson7.arena.heroes;

public class Hero {

    public String name;
    public int level;
    public int health;
    public final static int MAX_LEVEL = 100;
    private static int heroesCreated = 0;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        heroesCreated++;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health='" + health + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println("Info about Hero : " +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health='" + health + '\'' +
                '}');
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void levelUp() {
        if (this.level < MAX_LEVEL) {
            this.level++;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой атакует цель " + target + " " + times + " раза.");
    }

    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

}
