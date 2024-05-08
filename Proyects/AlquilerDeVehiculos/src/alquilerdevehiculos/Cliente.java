package alquilerdevehiculos;

public class Cliente {
    
    //Atributos de la clase
    String nombre;
    String apellido;
    int codigo;

    //Constructor que al crearse aumenta el num de cliente
    public Cliente(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        RegistrarCliente.aumentarNumCliente();
    }

    //Metodos gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //imprimir el cliente
    @Override
    public String toString() {
      return "Cliente:\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido+ "\n" +"Codigo: "+codigo+"\n-----------------------------------\n";
    }

}








