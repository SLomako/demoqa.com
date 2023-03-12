package test;

import Utils.RandomArrayUtils;
import Utils.RandomDateCalendarUtil;
import com.github.javafaker.Faker;

public class TestData {
    public static RandomDateCalendarUtil randomDateCalendarUtil = new RandomDateCalendarUtil();
    static Faker faker = new Faker();
    static RandomArrayUtils randomArrayUtils = new RandomArrayUtils();

    public static final String
            firstNameRandom = faker.name().firstName(),
            lastNameRandom = faker.name().lastName(),
            emailRandom = faker.internet().emailAddress(),
            addressRandom = faker.address().fullAddress(),
            numberPhoneRandom = "7" + faker.number().randomNumber(9, true),
            dateBirthOfDayRandomA = randomDateCalendarUtil.dateA,
            dateBirthOfDayRandomB = randomDateCalendarUtil.dateB,
            genderRandom = randomArrayUtils.getRandomGender();




}


