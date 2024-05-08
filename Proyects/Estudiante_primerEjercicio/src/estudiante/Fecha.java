package estudiante;
import javax.swing.JOptionPane;
public class Fecha {
    public int dia, mes, año;

    public Fecha(int dia, int mes, int año) {
        setAño(año);
        setDia(dia);
        setMes(mes);
    }

    public int getAño() {
        return año;
    }
    public final void setAño(int año) {
        if (año>1900 && año<2021){
           this.año = año;  
        } else {
            JOptionPane.showMessageDialog(null, "El año es incorrecto");
            this.año=0;
        }
    }
    public int getDia() {
        return dia;
    }
    public final void setDia(int dia) {
        if (dia>0 && dia<32){
             this.dia = dia;
        } else {
            JOptionPane.showMessageDialog(null, "El día es incorrecto");
            this.dia=0;
        }
    }
    public int getMes() {
        return mes;
    }
    public final void setMes(int mes) {
         if (mes>0 && mes<13){
             this.mes = mes;
        } else {
            JOptionPane.showMessageDialog(null, "El mes es incorrecto");
            this.mes=0;
        }
    }

    @Override
    public String toString() {
        return "dia: " + dia + ", mes: " + mes + ", a\u00f1o: " + año ;
    }
    
    
    
}
