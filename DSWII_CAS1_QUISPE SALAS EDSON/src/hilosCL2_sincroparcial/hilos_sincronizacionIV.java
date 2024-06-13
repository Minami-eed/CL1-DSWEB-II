package hilosCL2_sincroparcial;

public class hilos_sincronizacionIV implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(4000); // Retraso de 1 segundo
            System.out.println("4 soy Emprendedor 4");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
