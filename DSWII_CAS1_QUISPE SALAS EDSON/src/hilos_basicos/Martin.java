package hilos_basicos;

public class Martin implements Atleta, Runnable {

	@Override
	public void run() {
		correr();
		
	}

	@Override
	public void correr() {
		System.out.println("Martin recorre 2 km");
		
	}

}
