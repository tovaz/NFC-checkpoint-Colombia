package sitetech.NFCcheckPoint.Helpers;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeHelper {
    public static SimpleDateFormat formatDate = new SimpleDateFormat("dd MMM yyyy");
    public static SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ss");

    public static String getDate(Date d, String format){
        return new SimpleDateFormat(format).format(d);
    }

    public static String getDate(Date d){
        return TimeHelper.formatDate.format(d);
    }

    public static String getTime(Date d){
        return TimeHelper.formatTime.format(d);
    }

    public static String formatTime(int h, int m, int s){
        String hh = String.valueOf(h);
        String mm = String.valueOf(m);
        String ss = String.valueOf(s);

        if (h<10) hh = "0" + String.valueOf(h);
        if (m<10) mm = "0" + String.valueOf(m);
        if (s<10) ss = "0" + String.valueOf(s);

        return hh + ":" + mm + ":" + ss;
    }

    public static Long getTime(String time1){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date1 = format.parse(time1);
            return date1.getTime() / 1000;
        }catch (Exception e){
            return null;
        }
    }

    public static Long calcularDiferencia(String time1, String time2){
        try {
            long difference = getTime(time2) - getTime(time1);
            return difference / 1000;
        }catch (Exception e){
            return null;
        }
    }

    public static boolean esFindeSemana(Date date){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        Log.d("CHECK FIN DE SEMANA", getDate(date));
        if (c1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
                c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            return true;

        return false;
    }

    public static String getStringDiferencia(String time1, String time2){
        Long segundos = calcularDiferencia(time1, time2);
        return segundosahoras(segundos);
    }

    public static String segundosahoras (Long segs){
        boolean esnegativo = false;
        if (segs < 0) {
            esnegativo = true;
            segs = segs * -1;
        }

        int num,hor,min,seg;
        hor = segs.intValue() / 3600;
        min = (segs.intValue() - (3600 * hor)) / 60;
        seg = segs.intValue()- ((hor * 3600) + (min * 60));

        if (esnegativo)
            return "- " + formatTime(hor, min, seg);
        else
            return formatTime(hor, min, seg);
    }
}
