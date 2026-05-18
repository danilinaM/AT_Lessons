package alfa.lesson6.delivery.model;

public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel(String recipientName, String deliveryAdress, double deliveryWeigth, String trackNumber, int deliveryHours) {
        super(recipientName, deliveryAdress, deliveryWeigth, trackNumber);
        this.deliveryHours = deliveryHours;
    }

    @Override
    public double calculateDeliveryPrice() {

        double deliveryPrice = super.calculateDeliveryPrice();

        if (deliveryHours < 24) {
            return deliveryPrice + 500;
        } else {
            return deliveryPrice;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours + " hours");
    }
}
