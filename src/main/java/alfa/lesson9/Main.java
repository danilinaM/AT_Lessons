package alfa.lesson9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        GenerateLogo generateLogo = new GenerateLogo();
        generateLogo.printLogo();

        GenerateRegistrationData.generateFullName();
        GenerateRegistrationData.generatePhoneNumber();
        GenerateRegistrationData.generateAddress();
    }
}
