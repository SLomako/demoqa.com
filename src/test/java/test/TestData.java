package test;

import Utils.RandomStringUtils;
import Utils.RandomDateCalendarUtil;
import com.github.javafaker.Faker;

import static Utils.RandomStringUtils.stateAndCity;

public class TestData {
    public static RandomDateCalendarUtil randomDateCalendarUtil = new RandomDateCalendarUtil();
    static Faker faker = new Faker();


    public static final String
            firstNameRandom = faker.name().firstName(),
            lastNameRandom = faker.name().lastName(),
            emailRandom = faker.internet().emailAddress(),
            addressRandom = faker.address().fullAddress(),
            numberPhoneRandom = "7" + faker.number().randomNumber(9, true),
            dateBirthOfDayRandomA = randomDateCalendarUtil.dateA,
            dateBirthOfDayRandomB = randomDateCalendarUtil.dateB,
            genderRandomOffered = RandomStringUtils.getRandomStringFromArray(new String[]{"Male", "Female", "Other"}),
            subjectsRandomOffered = RandomStringUtils.getRandomStringFromArray(new String[]{"Accounting", "Maths", "Arts",
                    "English", "Physics", "Chemistry", "Computer Science",
                    "Economics", "Social Studies", "History", "Civics", "Commerce",
                    "Hindi", "Biology"}),
            hobbiesRandomOffered = RandomStringUtils.getRandomStringFromArray(new String[]{"Reading", "Sports", "Music"}),
            stateRandomOffered = faker.options().nextElement(stateAndCity.keySet().toArray()).toString(),
            cityRandomOffered = faker.options().nextElement(stateAndCity.get(stateRandomOffered)),
            fileUploud = "src/test/resources/pictures/prt_sc.png";

}


