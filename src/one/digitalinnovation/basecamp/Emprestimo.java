package one.digitalinnovation.basecamp;

import org.w3c.dom.ls.LSOutput;

public class Emprestimo {
    public static void calculaEmprestimo (int tempo, double valor) {
        double percentual = 13.75;

        for (int i = 1; i <= tempo; i++) {
          double valorjuros = valor*(percentual/100);
          valor += valorjuros;
        }

        valor = (int)valor;

        System.out.println("Valor final a ser pago: R$"+valor);
    }

    public static Boolean validaTempo (int tempo) {
        Boolean valid;

        if (tempo < 5) {
            valid=false;
            System.out.println("Tempo informado abaixo de 5 anos!!");
        } else {
            valid = true;
        }

        return valid;
    }


}
