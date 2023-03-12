package Utils;

public class RandomArrayUtils {

    public String getRandomGender() {

        String[] gender = new String[]{"Male", "Female", "Other"};
        int n = (int) Math.floor(Math.random() * gender.length);
        return gender[n];
    }
}
