package archivos_Basicos_Parcial_Xml;

public class Principal_Empleado {

	public static void main(String[] args) {
        EmpleadoJAXB empleadoJAXB = new EmpleadoJAXB();
        empleadoJAXB.marshal(1500); // Aquí ingresas el sueldo dinámicamente
        empleadoJAXB.unmarshal();

	}

}
