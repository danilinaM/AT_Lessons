package alfa.lesson9;

import net.datafaker.Faker;

public class GenerateRegistrationData {
   static private Faker faker = new Faker();

    static String generateFullName() {
        String fullName = faker.name().fullName();
        System.out.println(fullName);
        return fullName;
    }

   static String generatePhoneNumber(){
        String phoneNumber = faker.phoneNumber().phoneNumberInternational();
        System.out.println(phoneNumber);
        return phoneNumber;
    }

   static String generateAddress(){
        String address = faker.address().fullAddress();
        System.out.println(address);
        return address;
    }
}
