package test;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;



public class PracticeFormTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillStudentRegistrationForm() {

        String randomGender = TestData.getRandomGender();
        practiceFormPage.openPage()
                .removeBanners()
                .setFirstName()
                .setLastName()
                .setEmail()
                .setGender(randomGender)
                .setNumberPhone()
                .setSubjects("English")
                .setDateOfBirth()
                .setHobbies("Sports")
                .setHobbies("Music")
                .setUploudPicture("src/test/resources/pictures/prt_sc.png")
                .setAddress()
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit();

        practiceFormPage.shouldHaveResults("Student Name", TestData.firstNameFaker + " " + TestData.lastNameFaker)
                .shouldHaveResults("Student Email", TestData.emailFaker)
                .shouldHaveResults("Gender", randomGender)
                .shouldHaveResults("Mobile", TestData.numberPhoneFaker)
                .shouldHaveResults("Date of Birth", TestData.getDate)
                .shouldHaveResults("Subjects", "English")
                .shouldHaveResults("Hobbies", "Sports, Music")
                .shouldHaveResults("Picture", "prt_sc.png")
                .shouldHaveResults("Address", TestData.addressFaker)
                .shouldHaveResults("State and City", "NCR Delhi");
    }
}
