package kata1v2;

import java.util.Calendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long)(365.25*24*60*60*1000);

    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        Calendar today;
        today = Calendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()-birthday.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
}
