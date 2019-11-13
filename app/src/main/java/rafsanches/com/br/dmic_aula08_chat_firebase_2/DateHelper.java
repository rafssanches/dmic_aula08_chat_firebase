package rafsanches.com.br.dmic_aula08_chat_firebase_2;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateHelper {

    public static String format (Date date){
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date);
    }
}
