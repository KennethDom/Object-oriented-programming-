package alquilerdevehiculos;

public class Automovil extends VehiculoPasajeros {

    public Automovil(int plazas, String matricula) {
        super(plazas, matricula);
        RegistroVehiculos.numVehiculos();
    }

    //Metodos get y set
    public static double getPRECIO_POR_PLAZA() {
        return PRECIO_POR_PLAZA;
    }

    public static double getPRECIO_POR_DIA() {
        return PRECIO_POR_DIA;
    }
    
    //Calculo del precio de alquiler
    @Override
    public double precioAlquiler(int dias) {
        return (PRECIO_POR_DIA * dias);
    }

    //imprimir el tipo de vehiculo junto al super
    @Override
    public String toString() {
        return super.toString()+"\nTipo de vehiculo: Automovil"+"\n-----------------------------------\n";
    }
    
}












