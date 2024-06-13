package hilos_basicos;

public class Ricardo implements Atleta, Runnable {

	@Override
	public void run() {
		correr();
		
	}

	@Override
	public void correr() {
        System.out.println("Ricardo recorre 2 km");
        System.out.println("Ricardo recorre 3 km");
        System.out.println("Ricardo recorre 4 km");
        System.out.println("Ricardo recorre 5 km");
        
	}
	
}
