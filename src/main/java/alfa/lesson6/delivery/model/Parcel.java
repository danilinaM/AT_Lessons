package alfa.lesson6.delivery.model;

public class Parcel {

    private String recipientName = "Не указан";
    private String deliveryAdress = "Не указан";
    protected double deliveryWeigth = 0.0;
    String trackNumber = "Не указан";

    public Parcel() {
    }

    public Parcel(String recipientName, String deliveryAdress, double deliveryWeigth, String trackNumber) {
        this.recipientName = recipientName;
        this.deliveryAdress = deliveryAdress;
        this.deliveryWeigth = deliveryWeigth;
        this.trackNumber = trackNumber;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public double getDeliveryWeigth() {
        return deliveryWeigth;
    }

    private void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    private void setDeliveryAddress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    protected void setDeliveryWeigth(int deliveryWeigth) {
        this.deliveryWeigth = deliveryWeigth;
    }

    public double calculateDeliveryPrice() {
        return 100 + deliveryWeigth * 30;
    }

    public void printInfo() {
        System.out.println("Reciepent Name = " + getRecipientName()
                + ", Delivery address = " + getDeliveryAdress()
                + ", Delivery weigth = " + getDeliveryWeigth()
                + ", Track number = " + trackNumber);
    }
}
