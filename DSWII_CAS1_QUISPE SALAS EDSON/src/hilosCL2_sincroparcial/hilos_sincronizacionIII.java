package hilosCL2_sincroparcial;

public class hilos_sincronizacionIII implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000); // Retraso de 1 segundo
            System.out.println("3 soy Emprendedor 5");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
