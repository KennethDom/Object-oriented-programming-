package estudiante;

import java.util.Calendar;

public class Persona {
        private Fecha fechaNac;
        private String primerApe, SegundoApe, primerNombre, segundoNombre;
        public Persona(Fecha fechaNac, String primerApe, String segundoApe, String primerNombre, String segundoNombre){
            this.fechaNac=fechaNac;
            this.primerApe=primerApe;
            this.SegundoApe=segundoApe;
            this.primerNombre=primerNombre;
            this.segundoNombre=segundoNombre;
        }
        public String getSegundoApe() {
            return SegundoApe;
        }
        public void setSegundoApe(String SegundoApe) {
            this.SegundoApe = SegundoApe;
        }
        public String getPrimerApe() {
            return primerApe;
        }
        public void setPrimerApe(String primerApe) {
            this.primerApe = primerApe;
        }
        public String getPrimerNombre() {
            return primerNombre;
        }
        public void setPrimerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
        }
        public String getSegundoNombre() {
            return segundoNombre;
        }
        public void setSegundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
        }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
        
        
        
public int calcularEdad(){
        int edad;
        /*creo un objeto calendar, haciendo uso del 
         * metodo estatico getInstance()*/
        Calendar cal=Calendar.getInstance();
        //obtener el año actual:
        int año=cal.get(Calendar.YEAR);
        //al año actual le restamos el año de nacimiento
        edad=año-fechaNac.getAño();
        //obtenemos el mes actual:
        int mes=cal.get(Calendar.MONTH);
        //restar al mes actual el mes de nacimiento:
        int difMes=mes-fechaNac.getMes();
        //obtenemos el día actual:
        int dia=cal.get(Calendar.DAY_OF_MONTH);
        //restar al dia actual el dia de nacimiento
        int difDia=dia-fechaNac.getDia();
        if(difMes<0){//aun no es el mes de su nacimiento
            edad--; //disminuir a edad un año
        } else {
       //esta en su mes de nacimiento pero aun no en el dia
            if (difDia<0){
                edad--;//disminuir a edad un año
            }
        }
        return edad;
    }    
        @Override
        public String toString() {
            return primerApe + " " + SegundoApe + " " + primerNombre + " " + segundoNombre ;
        }
    }


