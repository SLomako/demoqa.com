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
                .setGender(genderRandomOffered)
                .setNumberPhone(numberPhoneRandom)
                .setSubjects(subjectsRandomOffered)
                .setDateOfBirth(dateBirthOfDayRandomA)
                .setHobbies(hobbiesRandomOffered)
                .setUploudPicture(fileUploud)
                .setAddress(addressRandom)
                .setState(stateRandomOffered)
                .setCity(cityRandomOffered)
                .clickSubmit();

        practicalFormResultModal.verifyResults("Student Name", firstNameRandom + " " + lastNameRandom)
                .verifyResults("Student Email", emailRandom)
                .verifyResults("Gender", genderRandomOffered)
                .verifyResults("Mobile", numberPhoneRandom)
                .verifyResults("Date of Birth", dateBirthOfDayRandomB)
                .verifyResults("Subjects", subjectsRandomOffered)
                .verifyResults("Hobbies", hobbiesRandomOffered)
                .verifyResults("Picture", "prt_sc.png")
                .verifyResults("Address", addressRandom)
                .verifyResults("State and City", stateRandomOffered + " " + cityRandomOffered);
    }
}
