package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        for (int i = 0; i < 10; i++) {
            System.out.println("Cat name " + faker.cat().name());
        }
        //adresi, telefona numuru, e-pastu, uzvārdu, jokus par Čaku Norisu :)
        System.out.println(faker.address().country() + "  " + faker.address().city());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.name().lastName());
        System.out.println(faker.chuckNorris().fact());
    }
}
