package estudiante;
public class Carrera {

    private String nombre;
    private String especialidad;
    private int creditos;

    public Carrera(String nombre, String especialidad, int creditos) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre + ", especialidad=" + especialidad + ", creditos=" + creditos ;
    }
}
