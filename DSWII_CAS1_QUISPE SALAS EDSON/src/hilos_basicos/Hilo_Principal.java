package hilos_basicos;

import java.util.Scanner;

public class Hilo_Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Ingrese una opcion del 1 al 4, o 0 para salir");
            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Programa finalizado");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion invalida, por favor intente de nuevo");
                continue;
            }

            HiloOpciones hilo = new HiloOpciones(opcion);
            hilo.start();

            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
