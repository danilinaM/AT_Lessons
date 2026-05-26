package alfa.lesson7.arena.heroes;

public class Hero {

    private String name;
    private int level;
    private int health;
    private final static int MAX_LEVEL = 100;
    private static int heroesCreated = 0;

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name must contain at least 1 symbol");
        } else {
            this.name = name;
        }
    }

    public void setLevel(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Level must be in range from 0 to 100");
        } else {
            this.level = level;
        }
    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Health must be >=0");
        } else {
            this.health = health;
        }
    }

    public Hero(String name, int level, int health) {
        setName(name);
        setLevel(level);
        setHealth(health);
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
