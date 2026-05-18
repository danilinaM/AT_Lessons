package alfa.lesson6.delivery.app;

import alfa.lesson6.delivery.model.ExpressParcel;
import alfa.lesson6.delivery.model.FragileParcel;
import alfa.lesson6.delivery.model.Parcel;
import alfa.lesson6.delivery.service.ParcelService;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        Parcel parcel2 = new Parcel("Deil", "Piter", 0.33, "2");
        ExpressParcel expressParcel = new ExpressParcel("Chip", "Moskow", 0.01, "1", 5);
        FragileParcel fragileParcel = new FragileParcel("Ponka", "Sochi", 1, "3", true);

        Parcel[] parcels = {parcel, parcel2, expressParcel, fragileParcel};
        ParcelService parcelService = new ParcelService();
        parcelService.printParcelsReport(parcels);
    }
}
