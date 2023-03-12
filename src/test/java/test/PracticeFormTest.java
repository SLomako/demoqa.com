package test;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.PracticalFormResults;

public class PracticeFormTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticalFormResults practicalFormResults = new PracticalFormResults();

    @Test
    void fillStudentRegistrationForm() {
        TestData testData = new TestData();
        String randomGender = testData.getRandomGender();

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
        String g = TestData.firstNameFaker + " " + TestData.lastNameFaker;
        String b = TestData.emailFaker;
        practicalFormResults.verifyResults("Student Name",g)
                .verifyResults("Student Email",b)
                .verifyResults("Gender", randomGender)
                .verifyResults("Mobile", TestData.numberPhoneFaker)
                .verifyResults("Date of Birth", TestData.randomDateCalendar.dateB)
                .verifyResults("Subjects", "English")
                .verifyResults("Hobbies", "Sports, Music")
                .verifyResults("Picture", "prt_sc.png")
                .verifyResults("Address", TestData.addressFaker)
                .verifyResults("State and City", "NCR Delhi");
    }
}
