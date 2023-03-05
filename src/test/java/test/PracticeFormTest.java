package test;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;


public class PracticeFormTest extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillStudentRegistrationForm() {
        practiceFormPage.openPage().removeBanners()
                .setFirstName("Sergei")
                .setLastName("Lomako")
                .setEmail("lomakosv@gmail.com")
                .setGenter("Male")
                .setNumberPhone("0123456789")
                .setSubjects("English")
                .setDateOfBirth("11.16.1986")
                .setHobbies("Sports")
                .setHobbies("Music")
                .setUploudPicture("src/test/resources/pictures/prt_sc.png")
                .setAddres("null")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit();

        practiceFormPage.shouldHaveResults("Student Name", "Sergei Lomako")
                .shouldHaveResults("Student Email", "lomakosv@gmail.com")
                .shouldHaveResults("Gender", "Male")
                .shouldHaveResults("Mobile", "0123456789")
                .shouldHaveResults("Date of Birth", "16 November,1986")
                .shouldHaveResults("Subjects", "English")
                .shouldHaveResults("Hobbies", "Sports, Music")
                .shouldHaveResults("Picture", "prt_sc.png")
                .shouldHaveResults("Address", "null")
                .shouldHaveResults("State and City", "NCR Delhi");
    }
}
