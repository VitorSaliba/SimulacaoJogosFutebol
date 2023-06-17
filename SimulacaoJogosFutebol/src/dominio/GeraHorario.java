package dominio;

import java.util.Random;

public class GeraHorario {
    public static String gerarHorarioAleatorio() {
        Random random = new Random();
        int hora = random.nextInt(11) + 11; // Entre 11 e 21
        int minuto = 00;
        String horarioFormatado = String.format("%02d:%02d", hora, minuto);
        return horarioFormatado;
    }
}
