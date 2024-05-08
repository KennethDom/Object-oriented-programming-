package farmaciafinal;

public class Patente extends Medicamento {

    private String tipoMedicamento;
    private String nombreComercial;

    public Patente(String tipoMedicamento, String nombreComercial, String nombreGenerico, String caducidad, int concentracion, String formaFarmaceutica) {
        super(nombreGenerico, caducidad, concentracion, formaFarmaceutica);
        this.tipoMedicamento = tipoMedicamento;
        this.nombreComercial = nombreComercial;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Medicamento: " + tipoMedicamento + "\nNombre comercial: " + nombreComercial + "\n-----------------------------------\n";
    }

}

