package alfa.lesson7.arena.heroes;

public class Knight extends Hero{

    private boolean armor;

    public Knight(String name, int level, int health, boolean armor) {
        super(name, level, health);
        this.armor = armor;
    }

    public boolean getArmor() {
        return armor;
    }

    public void setArmor(boolean armor) {
        this.armor = armor;
    }

    @Override
    public void attack(){
        System.out.println("Рыцарь бьёт мечом!");
    }

    @Override
    public String toString() {
        return "Info about Knight : " +
                super.toString() +
                ", armor=" + armor +
                '}';
    }
}
