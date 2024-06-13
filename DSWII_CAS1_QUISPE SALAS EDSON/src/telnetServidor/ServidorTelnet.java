package telnetServidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTelnet {
    ServerSocket server;
    Socket socket;
    int puerto = 62000; // Cambiado al puerto 62000
    DataOutputStream salida;
    BufferedReader entrada;

    public void iniciar() {
        System.out.println("Esperando conexión desde un cliente en el puerto " + puerto);
        
        try {
            server = new ServerSocket(puerto);
            socket = server.accept();
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje = entrada.readLine();
            System.out.println("Mensaje del cliente: " + mensaje);
            
            salida = new DataOutputStream(socket.getOutputStream());
            // Aquí puedes agregar la lógica para responder a diferentes mensajes
            salida.writeUTF("El servidor contesta: " + procesarMensaje(mensaje));
            
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String procesarMensaje(String mensaje) {
        if (mensaje.equalsIgnoreCase("hola")) {
            return " Hola, espero te encuentres bien hoy";
        } else if (mensaje.equalsIgnoreCase("adios")) {
            return " Adiós, Espero verte pronto";
        } else {
            return "No entiendo el mensaje. Por favor, intenta con otro.";
        }
    }
}
