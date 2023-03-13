package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomDateCalendarUtil {

    protected final String dateA;
    protected final String dateB;

    public RandomDateCalendarUtil() {

        Faker faker = new Faker();
        Date randomDateFaker = faker.date().birthday();
        SimpleDateFormat simpleDateFormatDateA = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormatDateB = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);
        dateA = simpleDateFormatDateA.format(randomDateFaker);
        dateB = simpleDateFormatDateB.format(randomDateFaker);
    }

    public String getDateA() {
        return dateA;
    }

    public String getDateB() {
        return dateB;
    }
}
