package estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Estudiante extends Persona{
    private Carrera carrera;
    private String matricula="00410000";
    public static String escuela="ITP";
    public static final double MIN_APROVATORIA=70.0;
    static ArrayList <Estudiante> estudiantes = new ArrayList();
    
    public static void registrarEstudiante(Carrera carrera){//recibo carrera como parametro
        //pido datos y almaceno en variables temporales
        String primerApe=JOptionPane.showInputDialog(null,"Primer Apellido");
        String segundoApe=JOptionPane.showInputDialog(null,"Segundo Apellido");
        String primerNomb=JOptionPane.showInputDialog(null,"Primer Nombre");
        String segundoNomb=JOptionPane.showInputDialog(null,"Segundo Nombre");
        JOptionPane.showMessageDialog(null, "Fecha de Nacimiento");
        int fechaDia=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia"));
        int fechaMes=Integer.parseInt(JOptionPane.showInputDialog(null,"Mes"));
        int fechaAño=Integer.parseInt(JOptionPane.showInputDialog(null,"Año"));
           //creo el estudiante con las variables como argumentos
           //registrar profesor en la clase profesor 
        Fecha fechaNac=new Fecha(fechaDia,fechaMes,fechaAño);
        Estudiante est=new Estudiante(fechaNac,primerApe,segundoApe,primerNomb,
                segundoNomb,carrera);
        //agrego al arraylist
        estudiantes.add(est);
        //muestro el arraylist
        JOptionPane.showMessageDialog(null, estudiantes); 
    }
    
    //constructor con todos los parámetros
    public Estudiante(String primerApe, String segundoApe, 
            String primerNombre, String segundoNombre, 
            Carrera carrera,Fecha fechaNac) {
        super(fechaNac,primerApe, segundoApe, primerNombre, segundoNombre);
        this.carrera = carrera;
     }
    //constructor con nombre
    public Estudiante (String primerApe, String segundoApe, 
            String primerNombre, String segundoNombre, Fecha fechaNac){
        super(fechaNac,primerApe, segundoApe, primerNombre, segundoNombre);
        //this.nombre=new Nombre(primerApe, segundoApe, 
          //              primerNombre, segundoNombre);
    }
    //constructor sin parámetros
    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public static String getEscuela() {
        return escuela;
    }
    public static void setEscuela(String escuela) {
        Estudiante.escuela = escuela;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
   
    @Override
    public String toString() {
        return ", matricula: " + matricula +
                "\nCarrera: " + carrera +", Escuela: "+ 
                escuela+"\n"+"___________________________________"+"\n";
    }

    //clase interna que va a depender del estudiante, es decir para crear un nombre primero debo crear un estudiante

}
