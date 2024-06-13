package pc_cliente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Properties;

public class CLIENTE {

    public static void main(String[] args) {
    	Properties prop = new Properties();
    	
        try {
            prop.load(new FileInputStream("config.properties"));
            String serverIp = prop.getProperty("server.ip");
            
            Socket cliente = new Socket(serverIp, 4780);
            ObjectOutputStream salida = new ObjectOutputStream(cliente.getOutputStream());
            salida.writeObject("Hola servidor, consulta ¿Quién fue el presidente del Perú en 1844?");
            
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            System.out.println("Se ha recibido respuesta del Servidor");
            String mensaje = (String) entrada.readObject();
            System.out.println("Desde el Servidor: " + mensaje);
            
            cliente.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
