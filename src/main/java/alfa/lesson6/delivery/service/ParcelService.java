package alfa.lesson6.delivery.service;

import alfa.lesson6.delivery.model.Parcel;

public class ParcelService {

    public void printParcelsReport(Parcel[] parcels) {
        for (Parcel p : parcels) {
            p.printInfo();
            System.out.println("Delivery price =" + p.calculateDeliveryPrice());
            System.out.println();
        }
    }
}
