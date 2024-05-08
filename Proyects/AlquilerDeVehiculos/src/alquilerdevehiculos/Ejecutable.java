//Kenneth Gerardo Aguirre Dominguez




package alquilerdevehiculos;

import javax.swing.JOptionPane;

public class Ejecutable {

    //Controla el ciclo hasta que se cumpla 
    static Vehiculo[] tipo = new Vehiculo[10];
   
    public static void main(String[] args) {

        int i = 0;

        while (i < tipo.length) {

            RegistroVehiculos.numVehiculos();
            //Opcioes que te dan a elegir para seleccionar
            String[] hacer = {"Añadir vehiculo","Buscar vehiculo", "Mostrar precio vehiculo", "Lista de precios", "Registar cliente",
                 "Mostrar cliente", "Prestar", "Mostrar prestamos", "Salir"};
            String resp = (String) JOptionPane.showInputDialog(null, "Que deseas hacer", "Opciones",
                    JOptionPane.DEFAULT_OPTION, null, hacer, hacer[0]);

            //Llamada de las opciones junto a los metodos correspondientes
            if ("Añadir vehiculo".equals(resp)) {
                RegistroVehiculos.registroVehículos();
            }

            if ("Buscar vehiculo".equals(resp)) {
                String matricula = JOptionPane.showInputDialog("Ingresa la matricula");
                RegistroVehiculos.buscarVehiculo(matricula);
            }
            if ("Mostrar precio vehiculo".equals(resp)) {
                RegistroVehiculos.muestraPrecio();
            }

            if ("Lista de precios".equals(resp)) {
                RegistroVehiculos.mostrarTodosPrecios();
            }
 
            if ("Registar cliente".equals(resp)) {
                RegistrarCliente.registrarCliente();
            }

            if ("Mostrar cliente".equals(resp)) {
                RegistrarCliente.mostrarListaClientes();
            }

            if ("Prestar".equals(resp)) {
               Prestamo.Prestar();
            }

            if ("Mostrar prestamos".equals(resp)) {
                Prestamo.mostrarPrestamos();
            }

            if ("Salir".equals(resp)) {
                break;
            }
 
        }

    }
 
}





























