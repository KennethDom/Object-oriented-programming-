package alquilerdevehiculos;

//Vehiculo de carga abstracto que implementa la interfaz vehiculo
 public abstract class VehiculoCarga implements Vehiculo {

     //Constantes y atributos
    public static  double PRECIO_POR_TONELADA = 50.0;
    private int pesomaximo;
    private  String matricula;

    public VehiculoCarga(int pesomaximo, String matricula) {
        this.pesomaximo = pesomaximo; 
        this.matricula=matricula;
    }

   
       @Override
    public abstract double precioAlquiler(int dias); 
    
    //Metodos gets y sets
    public int getPesomaximo() {
        return pesomaximo;
    }

    public void setPesomaximo(int pesomaximo) {
        this.pesomaximo = pesomaximo;
    }
    
    public static double getPRECIO_POR_TONELADA() {
        return PRECIO_POR_TONELADA;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    public static double getPRECIO_POR_DIA() {
        return PRECIO_POR_DIA;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    //imprimir el vehiculo con peso maximo y matricula
    @Override
    public String toString() {
        return "Vehiculo carga\n" + "Peso maximo: " + pesomaximo + "\n" + "Matricula:" + matricula;
    }

}

















