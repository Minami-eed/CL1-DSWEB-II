package hilosCL2_sincroparcial;

public class hilos_sincronizacionI implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Retraso de 1 segundo
            System.out.println("1 soy Emprendedor 7");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
