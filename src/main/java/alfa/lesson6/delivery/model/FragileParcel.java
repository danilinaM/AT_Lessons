package alfa.lesson6.delivery.model;

public class FragileParcel extends Parcel {

    private boolean requiresCarefulHandling;

    public FragileParcel(String recipientName, String deliveryAdress, double deliveryWeigth, String trackNumber, boolean requiresCarefulHandling) {
        super(recipientName, deliveryAdress, deliveryWeigth, trackNumber);
        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    @Override
    public double calculateDeliveryPrice() {

        double deliveryPrice = super.calculateDeliveryPrice();
        return deliveryPrice + 200;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
