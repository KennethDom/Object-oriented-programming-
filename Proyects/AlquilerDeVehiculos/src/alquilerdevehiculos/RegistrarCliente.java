package alquilerdevehiculos;

import javax.swing.JOptionPane;

public class RegistrarCliente {
    //Atributos de la clase
    private static int numClientes;
    private static Cliente[] clientes = new Cliente[10];
    public static Cliente compradores;

    public static void registrarCliente() {
       //Registro de cliente
        Cliente cliente = null;
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del cliente");
        String apellido = JOptionPane.showInputDialog("Ingresa el apellido del cliente");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Dame el codigo del cliente"));
        cliente = new Cliente(nombre, apellido, codigo);
        clientes[numClientes-1]=cliente;
    }

    //Aumento de los clientes
    public static int aumentarNumCliente() {
        numClientes++;
        return numClientes;
    }

    //Busqueda del cliente
    public static Cliente buscarCliente(int codigo) {
        Cliente busqueda = null;
        
        for (int i = 0; i <= numClientes-1; i++) {
            if (clientes[i].getCodigo() == (codigo)) {
                busqueda = clientes[i];
                JOptionPane.showMessageDialog(null, busqueda);
            }else {
                busqueda = null;
            }
            
        }
        if (busqueda == null) {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra");
        }
        return busqueda;
    }

    //Mostrar los clientes actuales
     public static void mostrarListaClientes() {
        
        String list = "";
        for (int i = 0; i <= numClientes-1; i++) {

            list = list + clientes[i] + "\n-----------------------------------\n";

        }
        JOptionPane.showMessageDialog(null, clientes);

    }
    
    
    
}


























