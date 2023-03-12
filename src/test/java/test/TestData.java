package test;

import Utils.RandomDateCalendar;
import com.github.javafaker.Faker;

public class TestData {
    public static RandomDateCalendar randomDateCalendar = new RandomDateCalendar();
    static Faker faker = new Faker();

    public static final String
            firstNameFaker = faker.name().firstName(),
            lastNameFaker = faker.name().lastName(),
            emailFaker = faker.internet().emailAddress(),
            addressFaker = faker.address().fullAddress(),
            numberPhoneFaker = "7" + faker.number().randomNumber(9, true);


     public String getRandomGender() {

        String[] gender = new String[]{"Male", "Female", "Other"};
        int n = (int) Math.floor(Math.random() * gender.length);
        return gender[n];
    }
}


