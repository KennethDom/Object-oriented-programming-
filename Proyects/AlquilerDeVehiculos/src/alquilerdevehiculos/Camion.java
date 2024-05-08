package alquilerdevehiculos;

public class Camion extends VehiculoCarga {

    static double PRECIO_FIJO = 30.0;

    public Camion(int pesomaximo, String matricula) {
        super(pesomaximo,matricula);
        RegistroVehiculos.numVehiculos();
    }

    //Metodos get
    public static double getPRECIO_FIJO() {
        return PRECIO_FIJO;
    }

    public static double getPRECIO_POR_TONELADA() {
        return PRECIO_POR_TONELADA;
    }

    public static double getPRECIO_POR_DIA() {
        return PRECIO_POR_DIA;
    }

    //Calculo del precio de alquiler
    @Override
    public double precioAlquiler(int dias) {
        return  (PRECIO_POR_DIA * dias) + (PRECIO_POR_TONELADA * getPesomaximo()) + PRECIO_FIJO;
    }
    
    //imprimir el tipo de vehiculo junto al super
    @Override
    public String toString() {
        return super.toString()+"\nTipo de vehiculo: Camion"+"\n-----------------------------------\n";
    }

    
    

}



















