package pc_servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SERVIDOR {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4780);
            System.out.println("Servidor a la escucha de peticiones en el puerto 4780");
            Socket clienteServidor = servidor.accept();
            ObjectInputStream recibir = new ObjectInputStream(clienteServidor.getInputStream());
            System.out.println("Mensaje llegado con éxito");
            String mensaje = (String) recibir.readObject();
            System.out.println("Mensaje desde el cliente: " + mensaje);
            
            ObjectOutputStream enviar = new ObjectOutputStream(clienteServidor.getOutputStream());
            // Verifica si el mensaje contiene la consulta sobre el presidente
            if(mensaje.contains("¿Quién fue el presidente del Perú en 1844?")) {
                enviar.writeObject("El presidente fue Manuel Menéndez Gorozabel en 1844.");
            } else {
                enviar.writeObject("Consulta no reconocida.");
            }
            
            clienteServidor.close();
            servidor.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
