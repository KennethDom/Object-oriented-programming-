package farmaciafinal;

import javax.swing.JOptionPane;

public class Receta {

    private String nombre;
    private String apellido;
    private int edad;
    private String tipoMedicamento;
    private static int numRecetas;
    private String nombreDoctor;
    private String apellidoDoctor;
    private int codigo;

    private static Receta[] recetas = new Receta[10];

    public Receta(String nombre, String apellido, int edad, String tipoMedicamento, String nombreDoctor, String apellidoDoctor, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoMedicamento = tipoMedicamento;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.codigo = codigo;
    }

    public static void crearReceta() {
        try {
            Receta receta = null;
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            String apellido = JOptionPane.showInputDialog("Ingresa tu apellido");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Dame tu edad"));
            String[] tipoMedicamentos = {"Antibiotico", "Controlado"};
            String resp = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de medicamento para la receta", "Medicamento",
                    JOptionPane.DEFAULT_OPTION, null, tipoMedicamentos, tipoMedicamentos[0]);
            String nombreDoctor = JOptionPane.showInputDialog("Ingresa el nombre de tu doctor");
            String apellidoDoctor = JOptionPane.showInputDialog("Ingresa el apellido de tu doctor");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Dame el codigo de la receta"));
            if ("Antibiotico".equals(resp)) {

                receta = new Receta(nombre, apellido, edad, resp, nombreDoctor, apellidoDoctor, codigo);
                JOptionPane.showMessageDialog(null, receta, "Receta", JOptionPane.DEFAULT_OPTION);
            }

            if ("Controlado".equals(resp)) {

                receta = new Receta(nombre, apellido, edad, resp, nombreDoctor, apellidoDoctor, codigo);
                JOptionPane.showMessageDialog(null, receta, "Receta", JOptionPane.DEFAULT_OPTION);

            }

            recetas[numRecetas +1] = receta;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no fueron los correctos");
        }
    }

    public static void  buscarReceta() {

        Receta busqueda = null;
        int codigoReceta = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el codigo de la receta"));
        for (int i = 0; i <= numRecetas - 1; i++) {
            if (recetas[i].getCodigo() == (codigoReceta)) {
                busqueda = recetas[i];
                JOptionPane.showMessageDialog(null, busqueda);
                
        }
    }
        if (busqueda == null) {
            JOptionPane.showMessageDialog(null, "El codigo ingresado no coincide");
            registroVentas.RegistroVentas();
        }
        
    }

  
    public static void mostrarListaRecetas() {

        JOptionPane.showMessageDialog(null, recetas, "Recetas", JOptionPane.DEFAULT_OPTION);
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public static int getNumRecetas() {
        return numRecetas;
    }

    public static void setNumRecetas(int numRecetas) {
        Receta.numRecetas = numRecetas;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Receta\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nTipo de medicamento: " + tipoMedicamento + "\nDoctor: " + nombreDoctor + " " + apellidoDoctor + "\nCodigo: " + codigo + "\n--------------------------------------------------------------------";
    }

}





