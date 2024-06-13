package archivos_Basicos_Parcial_Xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class EmpleadoJAXB {
    public void marshal(double sueldo) {
        try {
            Empleado empleado = new Empleado(101, "miguel", "perez", "3814945", "lima", "empleado nuevo", sueldo);
            JAXBContext jaxbContext = JAXBContext.newInstance(Empleado.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(empleado, new File("src/Datos_Empleado_Xml/empleado.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unmarshal() {
        try {
            File file = new File("src/Datos_Empleado_Xml/empleado.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Empleado.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Empleado empleado = (Empleado) unmarshaller.unmarshal(file);

            // Lógica del bono
            if (empleado.getSueldo() >= 1600) {
                System.out.println("NO tiene bono");
            } else if (empleado.getSueldo() <= 1025) {
                System.out.println("SI tiene bono");
                empleado.setSueldo(1025);
            } else if (empleado.getSueldo() > 1025 && empleado.getSueldo() < 1600) {
                System.out.println("Tiene bono");
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
