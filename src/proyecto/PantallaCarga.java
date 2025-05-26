package proyecto;

import javax.swing.*;

public class PantallaCarga extends JFrame {
    public PantallaCarga() {
        setTitle("Cargando...");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Cargar el GIF de carga
        ImageIcon gifIcon = new ImageIcon("C:/Users/Alfonso/Downloads/carga.gif");
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(50, 50, gifIcon.getIconWidth(), gifIcon.getIconHeight());
        add(gifLabel);

        setVisible(true);

        // Simular carga antes de abrir la otra ventana
        new Thread(() -> {
            try {
                Thread.sleep(3000); // Espera 3 segundos
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            dispose(); // Cierra la pantalla de carga
        }).start();
    }
}