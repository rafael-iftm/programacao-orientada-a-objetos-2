import java.time.LocalDateTime;
import model.Passeio;
import controller.Estacionamento;

public class App {
    public static void main(String[] args) {
        LocalDateTime inicio = LocalDateTime.of(2024, 7, 1, 14, 30);
        LocalDateTime fim = LocalDateTime.of(2024, 7, 2, 10, 30);
        Passeio passeio = new Passeio("ABC-1234");
        Estacionamento estacionamento = new Estacionamento();
        double valor = estacionamento.calcularValor(inicio, fim, passeio);
        System.out.println("Valor da conta: " + valor);
    }
}
