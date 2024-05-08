package alquilerdevehiculos;
import javax.swing.JOptionPane;

public class RegistroVehiculos {

    static Vehiculo[] vehiculos = new Vehiculo[10];
    static int numVehiculos;

    
    //Registro de los vehiculos
    public static void registroVehículos() {
        Vehiculo v = null;
        String matricula = JOptionPane.showInputDialog(null, "Dame la matricula");
        String[] tipos = {"Camion", "Camioneta", "Autobus", "Automovil"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecciona tipo de vehiculo", "Vehiculo",
                JOptionPane.DEFAULT_OPTION, null, tipos, tipos[0]);

        if ("Camion".equals(resp)) {
            int pesomaximo = Integer.parseInt(JOptionPane.showInputDialog("Dame el peso maximo"));
            v = new Camion(pesomaximo, matricula);
        }

        if ("Camioneta".equals(resp)) {
            int pesomaximo = Integer.parseInt(JOptionPane.showInputDialog("Dame el peso maximo"));
            v = new Camioneta(pesomaximo, matricula);
        }

        if ("Autobus".equals(resp)) {
            int plazas = Integer.parseInt(JOptionPane.showInputDialog("Dame las plazas"));
            v = new Autobus(plazas, matricula);
        }

        if ("Automovil".equals(resp)) {
            int plazas = Integer.parseInt(JOptionPane.showInputDialog("Dame las plazas"));
            v = new Automovil(plazas, matricula);
        }
        vehiculos[0] = v;
    }

    //Aumento de los vehiculos
        public static void numVehiculos() {
        numVehiculos++;
    }
    
        //Busqueda de los vehiculos
    public static Vehiculo buscarVehiculo(String matricula) {
        Vehiculo busqueda = null;
        
        //No encontrar el error cambiar i=0 a i=1
        for (int i = 0; i <= numVehiculos - 1; i++) {
            if (vehiculos[i].getMatricula().equals(matricula)) {
                busqueda = vehiculos[i];
                JOptionPane.showMessageDialog(null, busqueda);
                break;
            } else {
                busqueda = null;
            }
        }
        if (busqueda == null) {
            JOptionPane.showMessageDialog(null, "El vehiculo no se encuentra");
        }

        return busqueda;
    }
    

    //Muestra todos los precios de los vehiculos
     public static String mostrarTodosPrecios() {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias ocupas el vehiculo"));
        String lista = "";
        for (int i = 0; i <= numVehiculos-1; i++) {
            String tipo = null;
            if (vehiculos[i] instanceof Camion) {
                tipo = "Camion de Carga ";
            }
            if (vehiculos[i] instanceof Camioneta) {
                tipo = "Camioneta de Carga ";
            }
            if (vehiculos[i] instanceof Autobus) {
                tipo = "Autobus de Pasajeros ";
            }
            if (vehiculos[i] instanceof Automovil) {
                tipo = "Automovil de Pasajeros ";
            }
            lista = lista + tipo + "\nMatricula: " + vehiculos[0].getMatricula()
                    + "\nPrecio por " + dias + " dias: " + vehiculos[0].precioAlquiler(dias) + "\n" + "____________________\n";
            
        }
        return lista;

    }

     //Muestra el precio del vehiculo
    public static Vehiculo muestraPrecio() {
        String matricula = JOptionPane.showInputDialog(null, "Dame la matricula del vehiculo");
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de dias"));
        Vehiculo v = buscarVehiculo(matricula);

        if (v == null) {
            JOptionPane.showMessageDialog(null, "Vehiculo no encontrado");
        } else {
            double precio = v.precioAlquiler(dias);
            JOptionPane.showMessageDialog(null, "Vehiculo: " + v.getMatricula() + " Precio por " + dias + " dias: " + precio);
        }
        return v;
    }

}


























































