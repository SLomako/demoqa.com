package Utils;

import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomDateCalendarUtil {

    public final String dateA;
    public final String dateB;

    public RandomDateCalendarUtil() {

        Faker faker = new Faker();
        Date randomDateFaker = faker.date().birthday();
        SimpleDateFormat simpleDateFormatDateA = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormatDateB = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);
        dateA = simpleDateFormatDateA.format(randomDateFaker);
        dateB = simpleDateFormatDateB.format(randomDateFaker);
    }
}
