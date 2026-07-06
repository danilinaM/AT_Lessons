package alfa.lesson12;

public class BaggageTicket {

    private String name;
    private String number;
    private int weigth;

    public BaggageTicket(String name, String number, int weigth) {
        this.name = name;
        this.number = number;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getWeigth() {
        return weigth;
    }

    @Override
    public String toString() {
        return "BaggageTicket info: " +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
