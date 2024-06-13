package hilosCL2_sincroparcial;

public class hilos_sincronizacionVI implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(6000); // Retraso de 1 segundo
            System.out.println("6 soy Emprendedor 2");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}	
