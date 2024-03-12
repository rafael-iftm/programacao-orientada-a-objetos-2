public class App {
    public static void main(String[] args) {
        System.out.println("Vou começar a thread");
        Contador contador = new Contador();
        Thread thread = new Thread(contador);
        thread.start();
        System.out.println("Terminei o programa principal");
    }
}
