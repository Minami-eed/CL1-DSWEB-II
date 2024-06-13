package hilosCL2_sincroparcial;

public class hilos_sincronizacionVII implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(7000); // Retraso de 1 segundo
            System.out.println("7 soy Emprendedor 1");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
