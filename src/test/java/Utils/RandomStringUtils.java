package Utils;

import com.github.javafaker.Faker;

import java.util.Map;

public class RandomStringUtils {
    static Faker faker = new Faker();

    public static String getRandomStringFromArray(String[] array) {
        return array[faker.random().nextInt(array.length)];

    }

    public static Map<String, String[]> stateAndCity = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
}

