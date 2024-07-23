package service;

import model.Passeio;
import model.Carga;
import model.Veiculo;

public class CalculoTarifa {
    private static final Tarifa TARIFA_HORA_PASSEIO = new TarifaHora(2.0);
    private static final Tarifa TARIFA_DIARIA_PASSEIO = new TarifaDiaria(26.0);
    private static final Tarifa TARIFA_MENSAL_PASSEIO = new TarifaMensal(300.0);
    private static final Tarifa TARIFA_HORA_CARGA = new TarifaHora(0.0);
    private static final Tarifa TARIFA_DIARIA_CARGA = new TarifaDiaria(0.0);
    private static final Tarifa TARIFA_MENSAL_CARGA = new TarifaMensal(0.0);

    public static double calcular(Veiculo veiculo, Duracao duracao) {
        long horas = duracao.getHoras();
        long dias = duracao.getDias();
        long meses = duracao.getMeses();

        if (veiculo instanceof Passeio) {
            if (horas < 12) {
                return TARIFA_HORA_PASSEIO.calcular(horas);
            } else if (dias < 15) {
                dias = dias + ((horas % 24 == 0) ? 0 : 1);
                return TARIFA_DIARIA_PASSEIO.calcular(dias);
            } else {
                meses = meses + ((dias % 30 == 0) ? 0 : 1);
                return TARIFA_MENSAL_PASSEIO.calcular(meses);
            }
        } else if (veiculo instanceof Carga) {
            if (horas < 12) {
                return TARIFA_HORA_CARGA.calcular(horas);
            } else if (dias < 15) {
                dias = dias + ((horas % 24 == 0) ? 0 : 1);
                return TARIFA_DIARIA_CARGA.calcular(dias);
            } else {
                meses = meses + ((dias % 30 == 0) ? 0 : 1);
                return TARIFA_MENSAL_CARGA.calcular(meses);
            }
        }
        return 0.0;
    }
}
