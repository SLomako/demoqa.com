package test;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class TestData {

    static Faker faker = new Faker();

    public static final String
            firstNameFaker = faker.name().firstName(),
            lastNameFaker = faker.name().lastName(),
            emailFaker = faker.internet().emailAddress(),
            addressFaker = faker.address().fullAddress(),
            numberPhoneFaker = "7" + faker.number().randomNumber(9, true);

    static final Date
            randomDayFaker = faker.date().birthday();

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
    public static final String setDate = simpleDateFormat.format(randomDayFaker);

    public static final SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);
    public static final String getDate = simpleDateFormat1.format(randomDayFaker);


    public static String getRandomGender() {

        String[] gender = new String[]{"Male", "Female", "Other"};
        int n = (int) Math.floor(Math.random() * gender.length);
        String randomGender = gender[n];
        return randomGender;
    }
}


