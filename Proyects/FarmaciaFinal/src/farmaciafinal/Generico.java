package farmaciafinal;

public class Generico extends Medicamento {

    private String tipoMedicamento;

    public Generico(String tipoMedicamento, String nombreGenerico, String caducidad, int concentracion, String formaFarmaceutica) {
        super(nombreGenerico, caducidad, concentracion, formaFarmaceutica);
        this.tipoMedicamento = tipoMedicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Medicamento: Generico" + "\n-----------------------------------\n";
    }

}

