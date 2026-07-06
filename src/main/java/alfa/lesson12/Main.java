package alfa.lesson12;

public class Main {

    public static void main(String[] args) {
        String[] flights = { "SU-123", "TK-777", "KC-909", "AE-404" };
        BaggageDropDesk baggageDropDesk = new BaggageDropDesk(flights);
        baggageDropDesk.checkInBaggage("Ann", "TK-777",22);
        baggageDropDesk.checkInBaggage("Ann","123",22);
        baggageDropDesk.checkInBaggage("Ann", "TK-777",24);
        baggageDropDesk.checkInBaggage("Ann", "AE-404",20);
        baggageDropDesk.checkInBaggage(null, "AE-404",20);
        baggageDropDesk.checkInBaggage("Ann", "AE-404",-20);
    }
}
