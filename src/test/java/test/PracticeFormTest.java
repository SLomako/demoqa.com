package test;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.PracticalFormResultModal;

import static test.TestData.*;

public class PracticeFormTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticalFormResultModal practicalFormResultModal = new PracticalFormResultModal();

    @Test
    void fillStudentRegistrationForm() {

        practiceFormPage.openPage()
                .removeBanners()
                .setFirstName(firstNameRandom)
                .setLastName(lastNameRandom)
                .setEmail(emailRandom)
                .setGender(genderRandom)
                .setNumberPhone(numberPhoneRandom)
                .setSubjects("English")
                .setDateOfBirth(dateBirthOfDayRandomA)
                .setHobbies("Sports")
                .setHobbies("Music")
                .setUploudPicture("src/test/resources/pictures/prt_sc.png")
                .setAddress(addressRandom)
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit();

        practicalFormResultModal.verifyResults("Student Name", firstNameRandom + " " + lastNameRandom)
                .verifyResults("Student Email", emailRandom)
                .verifyResults("Gender", genderRandom)
                .verifyResults("Mobile", numberPhoneRandom)
                .verifyResults("Date of Birth", dateBirthOfDayRandomB)
                .verifyResults("Subjects", "English")
                .verifyResults("Hobbies", "Sports, Music")
                .verifyResults("Picture", "prt_sc.png")
                .verifyResults("Address", addressRandom)
                .verifyResults("State and City", "NCR Delhi");
    }
}
