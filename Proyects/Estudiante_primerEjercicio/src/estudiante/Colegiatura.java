package estudiante;
import javax.swing.JOptionPane;

public class Colegiatura{
    public static final double MENSUALIDAD=2000;
    
    public static double calcularCuotaDeportiva(){
        double cuotaD=0.0;
        //preguntar si el estudiante es deportista con un JOptionPane.showOptionDialog
        //si es cuotaD=0
        //sino cuota=10% de la mensualidad
        return cuotaD;
    }
    
    public static void calcularPago(int meses){
        double pago=0.0;
        int resp=JOptionPane.showConfirmDialog(null, "Deseas aplicar un descuento");
        if (JOptionPane.YES_OPTION==(resp)){
            //las siguientes dos lineas son para mostrar listas desplegables
            String [] opciones={"seleccione","Porcentaje","Monto"};
            String tipoDescuento=(String)JOptionPane.showInputDialog
                    (null, "Qué tipo de descuento es","Descuento"
                    ,JOptionPane.DEFAULT_OPTION, null, opciones,opciones[0]);
            
            if("Porcentaje".equalsIgnoreCase(tipoDescuento)){//si desea descontar por porcentaje
                int descuento=Integer.parseInt//pregunto el porcentaje y lo convierto a entero
                 (JOptionPane.showInputDialog
                        (null,"Proporciona el Porcentaje del descuento"));
                pago=calcularDescuento(descuento, meses)+calcularCuotaDeportiva();//invoco los metodos y envio los parametros
            }
            if ("Monto".equalsIgnoreCase(tipoDescuento)){//si desea descontar por monto
                double descuento=Double.parseDouble(JOptionPane.showInputDialog//pregunto el monto y lo convierto a entero
                        ("Proporciona el Monto del Descuento"));
                pago=calcularDescuento(descuento, meses)+calcularCuotaDeportiva();//invoco los metodos y envio los parametros
            }
            JOptionPane.showMessageDialog(null, "El pago que vas a realizar es: "+pago);//muestro resultados
        }
        if(JOptionPane.NO_OPTION==resp || JOptionPane.CANCEL_OPTION==resp){
            JOptionPane.showMessageDialog(null, "Estudiante sin descuento");
            pago=(MENSUALIDAD*meses)+calcularCuotaDeportiva();//calculo sin invocar los metodos de descuento
            JOptionPane.showMessageDialog(null, "El pago que vas a realizar es: "+pago);//muestro resultados
        }
    }
    //metodo para calcular descuento con porcentaje
    public static double calcularDescuento(int porcentaje, int meses){
        double descuento=0.0;
        //calculo el descuento a 100 tengo que agregarle una D para que lo tome como double y conserve los decimales       
        descuento=(MENSUALIDAD*meses)*porcentaje/100D; 
        return descuento;
    }
    //metodo para calcular descuento por monto exacto
    public static double calcularDescuento(double monto, int meses){
        double descuento;
        descuento=(MENSUALIDAD*meses)-monto;
        return descuento;
    }
}