package test;

import Utils.RandomStringUtils;
import Utils.RandomDateCalendarUtil;
import com.github.javafaker.Faker;

import java.util.Map;

public class TestData {
    static RandomDateCalendarUtil randomDateCalendarUtil = new RandomDateCalendarUtil();
    static Faker faker = new Faker();

    static  Map<String, String[]> stateAndCity = Map.of("NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"}, "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

    static  String
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
            file = "src/test/resources/pictures/prt_sc.png";

}


