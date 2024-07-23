package service;

import java.time.Duration;
import java.time.LocalDateTime;

public class Duracao {
    private long horas;
    private long dias;
    private long meses;

    public Duracao(LocalDateTime inicio, LocalDateTime fim) {
        Duration duracao = Duration.between(inicio, fim);
        this.horas = duracao.toHours();
        this.dias = horas / 24;
        this.meses = dias / 30;
    }

    public long getHoras() {
        return horas;
    }

    public long getDias() {
        return dias;
    }

    public long getMeses() {
        return meses;
    }
}
