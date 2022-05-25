package Esercizio3.Utilities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataFormatter {
    public static String format(Instant i){
        String dataFormattata;
        try {
            dataFormattata = DateTimeFormatter.ofPattern("dd MM yyyy - HH:mm")
                    .withLocale(Locale.getDefault())
                    .withZone(ZoneId.systemDefault())
                    .format(i);
        } catch (Exception e) {
            e.printStackTrace();
            dataFormattata = "La data non è stata calcolata correttamente";
        }
        return dataFormattata;
    }
}
