package test;

import Utils.RandomDateCalendar;
import com.github.javafaker.Faker;

public class TestData {
    public static RandomDateCalendar randomDateCalendar = new RandomDateCalendar();
    static Faker faker = new Faker();

    public static final String
            firstNameRandom = faker.name().firstName(),
            lastNameRandom = faker.name().lastName(),
            emailRandom = faker.internet().emailAddress(),
            addressRandom = faker.address().fullAddress(),
            numberPhoneRandom = "7" + faker.number().randomNumber(9, true),
            dateBirthOfDayRandomA = randomDateCalendar.dateA,
            dateBirthOfDayRandomB = randomDateCalendar.dateB;



     public String getRandomGender() {

        String[] gender = new String[]{"Male", "Female", "Other"};
        int n = (int) Math.floor(Math.random() * gender.length);
        return gender[n];
    }
}


