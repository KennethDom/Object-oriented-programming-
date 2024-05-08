package farmaciafinal;

import javax.swing.JOptionPane;

public class registroVentas {

    private static Ventas[] ventas = new Ventas[10];
    private static int numVentas;

    public static void RegistroVentas() {

        try {
            Ventas v = null;
            String[] tipos = {"Antibiotico", "Controlado", "Antihistaminicos", "Analgesicos"};
            String resp = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de medicamento que deseas comprar", "Medicamento",
                    JOptionPane.DEFAULT_OPTION, null, tipos, tipos[0]);

            if ("Antibiotico".equals(resp)) {
                int receta = JOptionPane.showConfirmDialog(null, "Este medicamento requiere receta medica\n¿Desea crear una?"+ "", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (receta == 0) {
                    Receta.crearReceta();
                    String[] antibiotico = {"Ampicilina", "Amoxicilina", "Bencilpenicilina", "Tetracicilina"};
                    String ant = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Antibiotico", "Antibioticos",
                            JOptionPane.DEFAULT_OPTION, null, antibiotico, antibiotico[0]);
                    if ("Ampicilina".equals(ant)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Ampicilina requieres?"));
                        int precio = unidades * 113;
                        v = new Ventas(unidades, precio, ant);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }
                    if ("Amoxicilina".equals(ant)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Amoxicilina requieres?"));
                        int precio = unidades * 146;
                        v = new Ventas(unidades, precio, ant);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }
                    if ("Bencilpenicilina".equals(ant)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Bencilpenicilina requieres?"));
                        int precio = unidades * 119;
                        v = new Ventas(unidades, precio, ant);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }
                    if ("Tetracicilina".equals(ant)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Tetracicilina requieres?"));
                        int precio = unidades * 275;
                        v = new Ventas(unidades, precio, ant);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No puedes comprar este medicamento sin receta");
                }
            }

            if ("Controlado".equals(resp)) {
                int receta = JOptionPane.showConfirmDialog(null, "Este medicamento requiere receta medica\n¿Desea crear una?"+ "", "Alerta!", JOptionPane.YES_NO_OPTION);
                if (receta == 0) {
                    Receta.crearReceta();
                    String[] controlado = {"Clonazepam", "Zolpidem", "Eszopiclona", "Fenobarbital"};
                    String cont = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Antibiotico", "Antibioticos",
                            JOptionPane.DEFAULT_OPTION, null, controlado, controlado[0]);
                    if ("Clonazepam".equals(cont)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Clonazepam requieres?"));
                        int precio = unidades * 221;
                        v = new Ventas(unidades, precio, cont);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }

                    if ("Zolpidem".equals(cont)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Zolpidem requieres?"));
                        int precio = unidades * 1299;
                        v = new Ventas(unidades, precio, cont);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }
                    if ("Eszopiclona".equals(cont)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Eszopiclona requieres?"));
                        int precio = unidades * 609;
                        v = new Ventas(unidades, precio, cont);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }
                    if ("Fenobarbital".equals(cont)) {
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Fenobarbital requieres?"));
                        int precio = unidades * 350;
                        v = new Ventas(unidades, precio, cont);
                        JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No puedes comprar este medicamento sin receta");
                }
            }

            if ("Antihistaminicos".equals(resp)) {
                String[] antihistaminicos = {"Loratadina", "Oxatomida", "Clorfenamina", "Cetirizina"};
                String anti = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Antihistaminicos", "Antibioticos",
                        JOptionPane.DEFAULT_OPTION, null, antihistaminicos, antihistaminicos[0]);

                if ("Loratadina".equals(anti)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Loratadina requieres?"));
                    int precio = unidades * 35;
                    v = new Ventas(unidades, precio, anti);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Oxatomida".equals(anti)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Oxatomida requieres?"));
                    int precio = unidades * 30;
                    v = new Ventas(unidades, precio, anti);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Clorfenamina".equals(anti)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Clorfenamina requieres?"));
                    int precio = unidades * 47;
                    v = new Ventas(unidades, precio, anti);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Cetirizina".equals(anti)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Cetirizina requieres?"));
                    int precio = unidades * 65;
                    v = new Ventas(unidades, precio, anti);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }

            }
            if ("Analgesicos".equals(resp)) {
                String[] analgesicos = {"Paracetamol", "Naproxeno", "Diclofenaco", "Aspirina"};
                String ana = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Analgesicos", "Analgesicos",
                        JOptionPane.DEFAULT_OPTION, null, analgesicos, analgesicos[0]);

                if ("Paracetamol".equals(ana)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Paracetamol requieres?"));
                    int precio = unidades * 29;
                    v = new Ventas(unidades, precio, ana);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Naproxeno".equals(ana)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Naproxeno requieres?"));
                    int precio = unidades * 42;
                    v = new Ventas(unidades, precio, ana);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Diclofenaco".equals(ana)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Diclofenaco requieres?"));
                    int precio = unidades * 42;
                    v = new Ventas(unidades, precio, ana);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
                if ("Aspirina".equals(ana)) {
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades de Aspirina requieres?"));
                    int precio = unidades * 32;
                    v = new Ventas(unidades, precio, ana);
                    JOptionPane.showMessageDialog(null, v, "Ventas", JOptionPane.DEFAULT_OPTION);
                }
            }
            ventas[numVentas++] = v;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no fueron los correctos");
        }
    }

    public static void mostrarListaVentas() {

        JOptionPane.showMessageDialog(null, ventas, "Recetas", JOptionPane.DEFAULT_OPTION);
    }

    public static Ventas modificar() {

        Ventas busquedaUni = null;
        String tipoMed = JOptionPane.showInputDialog(null, "Dame el tipo de medicamento");
        for (int i = 0; i <= numVentas - 1; i++) {
            if (ventas[i].getMedicamento().equals(tipoMed)) {
                busquedaUni = ventas[i];
                JOptionPane.showMessageDialog(null, busquedaUni);
                int unidades = Integer.parseInt(JOptionPane.showInputDialog("Dame las nuevas unidades "));
                busquedaUni.setUnidades(unidades);
                JOptionPane.showMessageDialog(null, busquedaUni);
                break;
            } else {
                busquedaUni = null;
            }
        }
        if (busquedaUni == null) {
            JOptionPane.showMessageDialog(null, "El medicamento no se encuentra");
        }
        return busquedaUni;

    }
}





