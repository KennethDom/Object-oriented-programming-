package estudiante;
public class Profesor extends Persona{
private String numEmpleado; 
private int idProfesor;
private double sueldo;

    public Profesor(Fecha fechaNac,String primerApe, String segundoApe, String primerNombre, String segundoNombre) {
        super(fechaNac,primerApe, segundoApe, primerNombre, segundoNombre);
        this.idProfesor = idProfesor;
        this.sueldo=sueldo;
        this.numEmpleado=numEmpleado;
        
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    

}


