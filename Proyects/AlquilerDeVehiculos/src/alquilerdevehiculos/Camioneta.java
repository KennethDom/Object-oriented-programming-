package alquilerdevehiculos;

public class Camioneta extends VehiculoCarga {

    public Camioneta(int pesomaximo, String matricula) {
        super(pesomaximo,matricula);
        RegistroVehiculos.numVehiculos();
    }

    //Metodos get
    public static double getPRECIO_POR_TONELADA() {
        return PRECIO_POR_TONELADA;
    }

    public static double getPRECIO_POR_DIA() {
        return PRECIO_POR_DIA;
    }

    //Calculo del precio de alquiler
    @Override
    public double precioAlquiler(int dias) {
        return (PRECIO_POR_DIA * dias) + (PRECIO_POR_TONELADA * getPesomaximo());
    }
    
    //imprimir el tipo de vehiculo junto al super
    @Override
    public String toString() {
        return super.toString()+"\nTipo de vehiculo: Camioneta"+"\n-----------------------------------\n";
    }
}


