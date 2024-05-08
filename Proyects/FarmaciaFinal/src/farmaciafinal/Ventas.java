package farmaciafinal;

public class Ventas {

    private int unidades;
    private int precio;
    private String medicamento;

    public Ventas(int unidades, int precio, String medicamento) {
        this.unidades = unidades;
        this.precio = precio;
        this.medicamento = medicamento;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "\nEl precio por " + unidades + " unidades " + " de " + medicamento + " es de " + precio + "\n-------------------------------------------------------------------------";
    }

}

