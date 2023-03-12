package Utils;

import com.github.javafaker.Faker;

public class RandomStringUtils {
    static Faker faker = new Faker();

    public static String getRandomStringFromArray(String[] array) {
        return array[faker.random().nextInt(array.length)];

    }

}

