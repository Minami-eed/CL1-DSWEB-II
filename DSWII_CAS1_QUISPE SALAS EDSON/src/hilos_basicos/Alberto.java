package hilos_basicos;

public class Alberto implements Atleta, Runnable{

	@Override
	public void run() {
		correr();
		
	}

	@Override
	public void correr() {
		System.out.println("Alberto recorre 7 km");
		
	}
	
}
