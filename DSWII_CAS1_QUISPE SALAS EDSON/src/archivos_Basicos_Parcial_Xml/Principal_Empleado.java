package archivos_Basicos_Parcial_Xml;

public class Principal_Empleado {

	public static void main(String[] args) {
        EmpleadoJAXB empleadoJAXB = new EmpleadoJAXB();
        empleadoJAXB.marshal(1500); // Aqu� ingresas el sueldo din�micamente
        empleadoJAXB.unmarshal();

	}

}
