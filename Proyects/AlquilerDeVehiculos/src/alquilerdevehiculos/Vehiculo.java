package alquilerdevehiculos;

public interface Vehiculo {

    //Interface que se implementa en las otras clases
    static double PRECIO_POR_DIA = 50.0;
    String matricula = null;

    double precioAlquiler(int dias);

   String getMatricula();

    
    
}









