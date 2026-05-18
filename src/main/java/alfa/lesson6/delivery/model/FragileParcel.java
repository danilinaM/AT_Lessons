package alfa.lesson6.delivery.model;

public class FragileParcel extends Parcel {

    private boolean requiresCarefulHandling;

    public FragileParcel(String recipientName, String deliveryAdress, double deliveryWeigth, String trackNumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAdress, deliveryWeigth, trackNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
