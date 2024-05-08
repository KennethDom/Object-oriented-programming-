package alquilerdevehiculos;

abstract public class VehiculoPasajeros implements Vehiculo {

    //Constantes y atributos 
    static final double PRECIO_POR_PLAZA = 5;
    private int plazas;
    private  String matricula;

    public VehiculoPasajeros(int plazas, String matricula) {
        this.plazas = plazas;
        this.matricula=matricula;
    }

    //Metodos gets y sets
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public static double getPRECIO_POR_PLAZA() {
        return PRECIO_POR_PLAZA;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    public static double getPRECIO_POR_DIA() {
        return PRECIO_POR_DIA;
    }

    @Override
    public abstract double precioAlquiler(int dias);

    
    //imprimir el vehiculo con peso plazas y matricula
    @Override
    public String toString() {
        return "Vehiculo Pasajeros\n" + "Plazas: " + plazas + "\n" + "Matricula: " + matricula;
    }

}

   
   
























