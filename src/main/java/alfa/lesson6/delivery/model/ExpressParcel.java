package alfa.lesson6.delivery.model;

public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel(String recipientName, String deliveryAdress, double deliveryWeigth, String trackNumber, int deliveryHours) {
        super(recipientName, deliveryAdress, deliveryWeigth, trackNumber);
        this.deliveryHours = deliveryHours;
    }

    public double calculateDeliveryPrice() {
        if (deliveryHours < 24) {
            return super.calculateDeliveryPrice() + 500;
        } else {
            return super.calculateDeliveryPrice();
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours + " hours");
    }
}
