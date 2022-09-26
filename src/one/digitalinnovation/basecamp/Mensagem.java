package one.digitalinnovation.basecamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Mensagem {
    public static void mensagem (String nome) {
        Locale.setDefault(new Locale("pt", "BR"));
        Date data = new Date();

        long hora = data.getHours();
        String periodo;
        if (hora > 12 && hora < 18) {
            periodo = "Boa tarde, ";
        } else if (hora > 18) {
            periodo = "Boa noite, ";
        } else {
            periodo = "Bom dia, ";
        }

        System.out.println(periodo + nome);
    }
}
