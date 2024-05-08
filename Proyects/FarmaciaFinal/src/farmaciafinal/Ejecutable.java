package farmaciafinal;

import javax.swing.JOptionPane;

public class Ejecutable {

    static Medicamento[] tipo = new Medicamento[10];

    public static void main(String[] args) {

        int i = 0;

        while (i < tipo.length) {
            String[] hacer = {"Registrar Medicamento", "Registro Venta", "Lista de recetas", "Lista de medicamentos", "Lista de ventas","Modificar unidades" ,"Salir"};
            String resp = (String) JOptionPane.showInputDialog(null, "              "
                    + "       ¿Que deseas hacer?", "Opciones",
                    JOptionPane.DEFAULT_OPTION, null, hacer, hacer[0]);

            //Llamada de las opciones junto a los metodos correspondientes
            if ("Registrar Medicamento".equals(resp)) {
                registroMedicamento.RegistroMedicamento();
            }

            if ("Registro Venta".equals(resp)) {
                registroVentas.RegistroVentas();
            }
            if ("Lista de recetas".equals(resp)) {
                Receta.mostrarListaRecetas();
            }

            if ("Lista de medicamentos".equals(resp)) {
                registroMedicamento.mostrarListaMedicamentos();
            }

            if ("Lista de ventas".equals(resp)) {
                registroVentas.mostrarListaVentas();
            }
            
            if ("Modificar unidades".equals(resp)) {
               registroVentas.modificar();
            }            
            

            if ("Salir".equals(resp)) {
                break;
            }

        }

    }
}


