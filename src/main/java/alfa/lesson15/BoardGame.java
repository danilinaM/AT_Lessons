package alfa.lesson15;

public class BoardGame {

    private String name;
    private int minAge;
    private int rentPrice;
    private boolean isRented;

    public BoardGame(String name, int minAge, int rentPrice) {
        this.name = name;
        this.minAge = minAge;
        this.rentPrice = rentPrice;
    }

    public boolean canBeRentedBy(int age) {
        if (age < minAge) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game info: " +
                "name='" + name + '\'' +
                ", minAge=" + minAge +
                ", rentPrice=" + rentPrice +
                ", isRented=" + isRented +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cant be null or empty");
        }
        this.name = name;
    }

    public void setMinAge(int minAge) {
        if (minAge < 0) {
            throw new IllegalArgumentException("Age cant be less than 0");
        }
        this.minAge = minAge;
    }

    public void setRentPrice(int rentPrice) {
        if (rentPrice < 0) {
            throw new IllegalArgumentException("Price cant be <0");
        }
        this.rentPrice = rentPrice;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
