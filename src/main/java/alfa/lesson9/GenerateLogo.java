package alfa.lesson9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;

public class GenerateLogo {

    private String surnames[] = {"Jolie","Aniston","Pitt","Willis"};

    public GenerateLogo(String[] surnames2) {
        this.surnames = surnames2;
    }
    public GenerateLogo(){
    }

    String getRandomLastname(){
        Random random = new Random();
        int index = random.nextInt(surnames.length);
        System.out.println(surnames[index]);
        return surnames[index];
    }

    String generateFakerLastname(){
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

    public String [] getSurnames() {
        return surnames;
    }
}
