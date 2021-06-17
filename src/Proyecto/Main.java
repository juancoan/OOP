//Juan Antonio Cordoba
package Proyecto;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Main {

    private static Random random = null;

    public static String getDateRand() {
        Calendar c = Calendar.getInstance(Locale.CHINA);
        Date d = c.getTime();//from w w  w .j a v a 2  s .c  o  m
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(d) + (int) (Math.random() * 10);
    }
}
