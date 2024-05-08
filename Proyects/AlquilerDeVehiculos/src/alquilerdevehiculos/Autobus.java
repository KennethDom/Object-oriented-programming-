package alquilerdevehiculos;

//Clase autobus que hereda de Vehiculo pasajeros
public class Autobus extends VehiculoPasajeros {

    //Constante
    private double precioPorPlaza = 10.0;

    public Autobus(int plazas, String matricula) {
        super(plazas,matricula);
        RegistroVehiculos.numVehiculos();
    }
    
    //Metodos get y set
    public double getPrecioPorPlaza() {
        return precioPorPlaza;
    }

    public void setPrecioPorPlaza(double precioPorPlaza) {
        this.precioPorPlaza = precioPorPlaza;
    }

    //Calculo del precio de alquiler
    @Override
    public double precioAlquiler(int dias) {
        double precio;
        precio = (PRECIO_POR_DIA * dias) + (PRECIO_POR_PLAZA * getPlazas());
        return precio;
    }

    //imprimir el tipo de vehiculo junto al super
    @Override
    public String toString() {
        return super.toString()+"\nTipo de vehiculo: Autobus"+"\n-----------------------------------\n";
    }

    
}




















