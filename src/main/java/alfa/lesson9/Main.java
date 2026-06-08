package alfa.lesson9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Logo generateLogo = new Logo();
        generateLogo.printLogo();

        RegistrationData.generateFullName();
        RegistrationData.generatePhoneNumber();
        RegistrationData.generateAddress();
    }
}
