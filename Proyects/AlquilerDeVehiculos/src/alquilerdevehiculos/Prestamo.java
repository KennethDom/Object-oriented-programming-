package alquilerdevehiculos;

import javax.swing.JOptionPane;

public class Prestamo {

    //Atributos de la clase
    Cliente cliente;
    Vehiculo vehiculo;
    int dias;
    public static int numPrestamos;
    private static Prestamo[] prestamos = new Prestamo[50];

    public Prestamo(Cliente cliente, Vehiculo vehiculo, int dias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
        aumentarNumPrestamos();
    }

    //Metodo prestar
    static void Prestar() {
        Prestamo prestamo = null;
        Vehiculo vehiculos = null;
        Cliente cliente = null;
        int numCodigo = Integer.parseInt(JOptionPane.showInputDialog("Dame el codigo del cliente"));
        cliente = RegistrarCliente.buscarCliente(numCodigo);
        String matricula = JOptionPane.showInputDialog(null, "Dame la matricula");
        vehiculos = RegistroVehiculos.buscarVehiculo(matricula);
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de dias"));
        prestamo = new Prestamo(cliente, vehiculos, dias);
        prestamos[0] = prestamo;
    }

    //Muestra los prestamos
    static void mostrarPrestamos() {
        String list = "";
        for (int i = 0; i <= numPrestamos - 1; i++) {

            list = list + prestamos[i] + "\n-----------------------------------\n";

        }
        JOptionPane.showMessageDialog(null, list);
    }

    
    public static void aumentarNumPrestamos() {
        numPrestamos++;
    }

    //Metodos gets y sets
   
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public static int getNumPrestamos() {
        return numPrestamos;
    }

    public static void setNumPrestamos(int numPrestamos) {
        Prestamo.numPrestamos = numPrestamos;
    }

    public static Prestamo[] getPrestamos() {
        return prestamos;
    }

    public static void setPrestamos(Prestamo[] prestamos) {
        Prestamo.prestamos = prestamos;
    }

    //Imprime el prestamo
    @Override
    public String toString() {
        return "Prestamo:\n" + "Cliente: " + cliente + "\n" + "Vehiculo: " + vehiculo + "\n" + "Dias: " + dias + "\n";
    }

}




