package alfa.lesson9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;

public class Logo {

    private String surnames[] = {"Jolie", "Aniston", "Pitt", "Willis"};

    public Logo(String[] surnames2) {
        this.surnames = surnames2;
    }

    public Logo() {
    }

    String getRandomLastname() {
        Random random = new Random();
        int index = random.nextInt(surnames.length);
        System.out.println(surnames[index]);
        return surnames[index];
    }

    String generateFakerLastname() {
        Faker faker = new Faker();
        String lastName = faker.name().lastName();
        System.out.println(lastName);
        return lastName;
    }

    void printLogo() throws IOException {
        String firstPart = FigletFont.convertOneLine(getRandomLastname());
        String secondPart = FigletFont.convertOneLine("&");
        String thirdPart = FigletFont.convertOneLine(generateFakerLastname());
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);
    }

    public void setSurnames(String[] surnames) {
        this.surnames = surnames;
    }

    public String[] getSurnames() {
        return surnames;
    }
}
