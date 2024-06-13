package hilosCL2_sincroparcial;

public class Hilos_Principal_Sincronizacion {

    public static void main(String[] args) {
    	
        Thread[] hilos = new Thread[7];

        
        hilos[0] = new Thread(new hilos_sincronizacionI());
        hilos[1] = new Thread(new hilos_sincronizacionII());
        hilos[2] = new Thread(new hilos_sincronizacionIII());
        hilos[3] = new Thread(new hilos_sincronizacionIV());
        hilos[4] = new Thread(new hilos_sincronizacionV());
        hilos[5] = new Thread(new hilos_sincronizacionVI());
        hilos[6] = new Thread(new hilos_sincronizacionVII());
        
        for (int i = 0; i < hilos.length; i++) {
            hilos[i].start();
            
        }
    }
}
