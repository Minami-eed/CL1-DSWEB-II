package hilosCL2_sincroparcial;

public class hilos_sincronizacionV implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000); // Retraso de 1 segundo
            System.out.println("5 soy Emprendedor 3");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
