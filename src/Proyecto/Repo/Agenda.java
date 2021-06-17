package Proyecto.Repo;

import java.util.Random;

public class Agenda {

    private final static java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat("dd/MM/yyyy HH:hh");

    public static String generateRandomDate() {
        Random r = new Random();
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.MONTH, Math.abs(r.nextInt()) % 12);
        c.set(java.util.Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
        c.setLenient(true);
        return DATE_FORMAT.format(c.getTime());
    }

/*

java.util.Date dateFromDB = new java.util.Date(System.currentTimeMillis());
Calendar calendarFromDB = Calendar.getInstance();

calendarFromDB.setTime(dateFromDB);

java.util.Date randomDate = RandomUtil.getRandomDate(new java.util.Date(RandomUtil.getMinimumDate()), new java.util.Date(RandomUtil.getMaximumDate()), false);
Calendar calendar=Calendar.getInstance();
calendar.setTime(randomDate);

calendarFromDB.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY));
calendarFromDB.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
calendarFromDB.set(Calendar.SECOND, calendar.get(Calendar.SECOND));

dateFromDB = calendarFromDB.getTime();
Sample output:

Tue Jul 26 02:30:27 CET 157737154

or if you want just random date or time between some dates

java.util.Date randomDate = RandomUtil.getRandomDate(new java.util.Date(RandomUtil.getMinimumDate()), new java.util.Date(RandomUtil.getMaximumDate()), false);
SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
System.out.println(sdf.format(randomDate));


*/

}
