package farmaciafinal;

import javax.swing.JOptionPane;

public class registroMedicamento {

    private static Medicamento[] medicamentos = new Medicamento[10];
    private static int numMedicamento;

    public static void RegistroMedicamento() {
        try {
            Medicamento m = null;
            String[] tipos = {"Antibiotico", "Controlado", "Antihistaminicos", "Analgesicos"};
            String resp = (String) JOptionPane.showInputDialog(null, "      Selecciona el tipo de Medicamento", "Medicamento",
                    JOptionPane.DEFAULT_OPTION, null, tipos, tipos[0]);
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Dame el dia de caducidad"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Dame el mes de caducidad"));
            int agno = Integer.parseInt(JOptionPane.showInputDialog("Dame el año de caducidad"));
            String caducidad = dia + "/" + mes + "/" + agno;

            if ("Antibiotico".equals(resp)) {
                String[] antibiotico = {"Ampicilina", "Amoxicilina", "Bencilpenicilina", "Tetracicilina"};
                String ant = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Antibiotico", "Antibioticos",
                        JOptionPane.DEFAULT_OPTION, null, antibiotico, antibiotico[0]);
                if ("Ampicilina".equals(ant)) {
                    JOptionPane.showMessageDialog(null, "Registraste Ampicilina");
                    m = new Patente(resp, "Binotal", ant, caducidad, 250, "1 suspension");
                }
                if ("Amoxicilina".equals(ant)) {
                    JOptionPane.showMessageDialog(null, "Registraste Amoxicilina");
                    m = new Patente(resp, "AmoBay", ant, caducidad, 500, "10 Capsulas");
                }

                if ("Bencilpenicilina".equals(ant)) {
                    JOptionPane.showMessageDialog(null, "Registraste Bencilpenicilina");
                    m = new Patente(resp, "LugaXIL", ant, caducidad, 4, "1 suspension Inyectable");
                }

                if ("Tetracicilina".equals(ant)) {
                    JOptionPane.showMessageDialog(null, "Registraste Tetracicilina");
                    m = new Patente(resp, "Tetra-zil", ant, caducidad, 500, "100 Capsulas");
                }

            }

            if ("Controlado".equals(resp)) {

                String[] controlado = {"Clonazepam", "Zolpidem", "Eszopiclona", "Fenobarbital"};
                String cont = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Controlado", "Controlados",
                        JOptionPane.DEFAULT_OPTION, null, controlado, controlado[0]);

                if ("Clonazepam".equals(cont)) {
                    JOptionPane.showMessageDialog(null, "Registraste Clonazepam");
                    m = new Patente(resp, "Rivotril", cont, caducidad, 20, "10 tabletas");
                }
                if ("Zolpidem".equals(cont)) {
                    JOptionPane.showMessageDialog(null, "Registraste Zolpidem");
                    m = new Patente(resp, "Somno", cont, caducidad, 100, "10 tabletas");
                }

                if ("Eszopiclona".equals(cont)) {
                    JOptionPane.showMessageDialog(null, "Registraste Eszopiclona");
                    m = new Patente(resp, "Nirvan", cont, caducidad, 3, "30 comprimidos Recubiertos");
                }

                if ("Fenobarbital".equals(cont)) {
                    JOptionPane.showMessageDialog(null, "Registraste Fenobarbital");
                    m = new Patente(resp, "Fenabbott", cont, caducidad, 100, "20 comprimidos");
                }
            }

            if ("Antihistaminicos".equals(resp)) {
                String[] antihistaminicos = {"Loratadina", "Oxatomida", "Clorfenamina", "Cetirizina"};
                String anti = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Antihistaminicos", "Antihistaminicos",
                        JOptionPane.DEFAULT_OPTION, null, antihistaminicos, antihistaminicos[0]);
                if ("Loratadina".equals(anti)) {
                    JOptionPane.showMessageDialog(null, "Registraste Loratadina");
                    m = new Generico(resp, anti, caducidad, 200, "10 tabletas");
                }

                if ("Oxatomida".equals(anti)) {
                    JOptionPane.showMessageDialog(null, "Registraste Oxatomida");
                    m = new Generico(resp, anti, caducidad, 200, "20 tabletas");
                }

                if ("Clorfenamina".equals(anti)) {
                    JOptionPane.showMessageDialog(null, "Registraste Clorfenamina");
                    m = new Generico(resp, anti, caducidad, 250, "10 tabletas");
                }

                if ("Cetirizina".equals(anti)) {
                    JOptionPane.showMessageDialog(null, "Registraste Cetirizina");
                    m = new Generico(resp, anti, caducidad, 100, "1 solucion");
                }

            }

            if ("Analgesicos".equals(resp)) {
                String[] analgesicos = {"Paracetamol", "Naproxeno", "Diclofenaco", "Aspirina"};
                String ana = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de Analgesicos", "Analgesicos",
                        JOptionPane.DEFAULT_OPTION, null, analgesicos, analgesicos[0]);

                if ("Paracetamol".equals(ana)) {
                    JOptionPane.showMessageDialog(null, "Registraste Paracetamol");
                    m = new Generico(resp, ana, caducidad, 200, "15 tabletas");
                }

                if ("Naproxeno".equals(ana)) {
                    JOptionPane.showMessageDialog(null, "Registraste Naproxeno");
                    m = new Generico(resp, ana, caducidad, 250, "30 tabletas");
                }

                if ("Diclofenaco".equals(ana)) {
                    JOptionPane.showMessageDialog(null, "Registraste Diclofenaco");
                    m = new Generico(resp, ana, caducidad, 50, "10 tabletas");
                }

                if ("Aspirina".equals(ana)) {
                    JOptionPane.showMessageDialog(null, "Registraste Aspirina");
                    m = new Generico(resp, ana, caducidad, 100, "28 tabletas");
                }

            }
            medicamentos[numMedicamento++] = m;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no fueron los correctos");
        }
    }

    public static void mostrarListaMedicamentos() {

        JOptionPane.showMessageDialog(null, medicamentos, "Medicamentos", JOptionPane.DEFAULT_OPTION);
    }

}


