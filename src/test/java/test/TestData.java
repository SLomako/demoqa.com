package test;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();

    public static String
            firstNameFaker = faker.name().firstName(),
            lastNameFaker = faker.name().lastName(),
            emailFaker = faker.internet().emailAddress(),
            addresFaker = faker.address().fullAddress(),
            numberPhoneFaker = "7" + faker.number().randomNumber(9, true);


    public static void main(String[] args) {

        System.out.println(numberPhoneFaker);
        System.out.println(addresFaker);
        System.out.println(emailFaker);
        System.out.println(lastNameFaker);
        System.out.println(firstNameFaker);


    }

}
