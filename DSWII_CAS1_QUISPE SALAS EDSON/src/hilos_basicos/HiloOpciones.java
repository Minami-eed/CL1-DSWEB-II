package hilos_basicos;

public class HiloOpciones extends Thread {
    private int opcion;

    public HiloOpciones(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public void run() {
        switch (opcion) {
            case 1:
                mostrarPares();
                break;
            case 2:
                mostrarAlfabeto();
                break;
            case 3:
                mostrarSerie();
                break;
            case 4:
                mostrarAtletas();
                break;
            default:
                break;
        }
    }

    private void mostrarPares() {
        for (int p = 1; p <= 20; p++) {
            if (p % 2 == 0) {
                System.out.print(p + " ");
            }
            try {
                HiloOpciones.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    private void mostrarAlfabeto() {
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }

    private void mostrarSerie() {
        int termino = 1;
        System.out.print(termino);

        while (termino < 1000) {
            termino = termino * termino + 1;
            if (termino < 1000) {
                System.out.print(" " + termino);
            }
        }
        System.out.println();
    }

    private void mostrarAtletas() {
        Thread alberto = new Thread(new Alberto());
        Thread ricardo = new Thread(new Ricardo());
        Thread martin = new Thread(new Martin());

        alberto.start();
        ricardo.start();
        martin.start();

        try {
            alberto.join();
            ricardo.join();
            martin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
