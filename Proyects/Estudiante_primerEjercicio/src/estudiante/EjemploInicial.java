package estudiante;
import javax.swing.JOptionPane;
public class EjemploInicial {

    public static void main(String[] args) {
        Carrera sistemas=new Carrera("Sistemas","Desarrollo", 45);
        Carrera quimica=new Carrera("Quimica","Minerología", 46);
        Carrera administracion=new Carrera("Administración","Mercadotecnia", 39);
        
        boolean registrar=true;
        while (registrar==true){//ciclo para que siempre pregunte la accion a realizar hasta que se presione salir o cancelar
            String [] opciones={"Registrar estudiante","calcular pago", "Salir"};
        String resp =(String)JOptionPane.showInputDialog
        (null, "Qué deseas realizar", "Opciones",JOptionPane.DEFAULT_OPTION,
        null,opciones,opciones[0]);
        
        if( "Registrar estudiante".equalsIgnoreCase(resp)){
           String carrera=JOptionPane.showInputDialog("De cuál carrera?");
           if("sistemas".equalsIgnoreCase(carrera)){
               //lo que esta en el p[aretesis son los argumentos:
               Estudiante.registrarEstudiante(sistemas);
           } else{
           if("quimica".equalsIgnoreCase(carrera)){
               Estudiante.registrarEstudiante(quimica);
           } else {
           if("administracion".equalsIgnoreCase(carrera)){
               Estudiante.registrarEstudiante(administracion);
           } else {
               JOptionPane.showMessageDialog(null, "Error al ingresar la carrera");
           }  }  }
        }
        if ("calcular pago".equalsIgnoreCase(resp)){
            int meses=0;
            String lectura=(JOptionPane.showInputDialog("Cuántos meses deseas pagar"));
            if(lectura==null||"".equals(lectura)){//si presiona cancelar o aceptar sin haber ingresado nada
                break;
            }else {//en el curso normal del programa
                meses=Integer.parseInt(lectura);//convierto el string a entero
                Colegiatura.calcularPago(meses);//invoco el metodo y envio el numero de meses
            }
        }    
        if ("salir".equalsIgnoreCase(resp)||resp==null){
            registrar=false;
        }
        }
    }
    }

