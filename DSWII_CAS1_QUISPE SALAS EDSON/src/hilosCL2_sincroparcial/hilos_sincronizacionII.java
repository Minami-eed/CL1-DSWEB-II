package hilosCL2_sincroparcial;

public class hilos_sincronizacionII implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Retraso de 1 segundo
            System.out.println("2 soy Emprendedor 6");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
