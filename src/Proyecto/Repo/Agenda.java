package Proyecto.Repo;

import Proyecto.Generador.Cita;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda implements Cita {
    public void MostrarFecha() {
        System.out.println("Sus proximas 5 citas serian: ");
        for (int i=0;i<5;i++){
            Date date = randomDate("2021/01/01 00:00","2030/12/31 00:00");

            System.out.println(new SimpleDateFormat("---> yyyy/mm/dd hh:mm aa").format(date));
        }
    }
    private static Date randomDate(String beginDate,String endDate){
        try {
            DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
            Date start = format.parse(beginDate);
            Date end = format.parse(endDate);

            if(start.getTime() >= end.getTime()){
                return null;
            }
            long date = random(start.getTime(),end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin,long end){
        long rtn = begin + (long)(Math.random() * (end - begin));
        if(rtn == begin || rtn == end){
            return random(begin,end);
        }
        return rtn;
    }

    }
