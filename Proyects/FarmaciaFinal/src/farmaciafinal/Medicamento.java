package farmaciafinal;

public abstract class Medicamento {

    public String nombreGenerico;
    public String caducidad;
    public int concentracion;
    public String formaFarmaceutica;

    public Medicamento(String nombreGenerico, String caducidad, int concentracion, String formaFarmaceutica) {
        this.nombreGenerico = nombreGenerico;
        this.caducidad = caducidad;
        this.concentracion = concentracion;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    public String getformaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setformaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    @Override
    public String toString() {
        return "Medicamento" + "\nNombre Generico: " + nombreGenerico
                + "\nCaducidad: " + caducidad + "\nConcentracion: " + concentracion + "mg" + "\nForma Farmaceutica: " + formaFarmaceutica;
    }
}


