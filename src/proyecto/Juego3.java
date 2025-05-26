package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Juego3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego3 frame = new Juego3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Juego3.class.getResource("/imagenes/ChatGPT.png")));
		setTitle("LionGame");
		setBounds(100, 100, 820, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(12, 15, 22));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton volverButton = new JButton("Volver");
		volverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrada nuevoFrame = new entrada(""); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
	            dispose();
			}
		});
		
		volverButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                volverButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia a "mano"
            }

            public void mouseExited(MouseEvent e) {
                volverButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Vuelve al normal
            }
        });
		
		JButton trailerButton = new JButton("Haz click aquí para ver el trailer");
		trailerButton.setHorizontalAlignment(SwingConstants.LEFT);
		trailerButton.setFont(new Font("Verdana", Font.BOLD, 20));
		trailerButton.setForeground(new Color(255, 255, 255));
		trailerButton.setOpaque(false);
		trailerButton.setContentAreaFilled(false);
		trailerButton.setBorderPainted(false);
		trailerButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // URL del trailer
		            URI trailerLink = new URI("https://www.youtube.com/watch?v=pnSsgRJmsCc");
		            
		            // Verifica si Desktop es soportado y abre el navegador
		            if (Desktop.isDesktopSupported()) {
		                Desktop.getDesktop().browse(trailerLink);
		            } else {
		                System.out.println("❌ Error: No se puede abrir el enlace en este sistema.");
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		trailerButton.setBounds(0, 448, 456, 21);
		contentPane.add(trailerButton);
		volverButton.setForeground(Color.WHITE);
		volverButton.setFont(new Font("Verdana", Font.BOLD, 15));
		volverButton.setBackground(Color.GRAY);
		volverButton.setBounds(658, 409, 138, 60);
		contentPane.add(volverButton);
		
		JLabel tituloLabel = new JLabel("Black Myth: Wukong");
		tituloLabel.setBounds(10, 23, 360, 34);
		tituloLabel.setForeground(Color.WHITE);
		tituloLabel.setFont(new Font("Verdana", Font.BOLD, 28));
		contentPane.add(tituloLabel);
		
		JLabel anuncioLabel = new JLabel("Comprar Black Myth: Wukong");
		anuncioLabel.setForeground(new Color(255, 255, 255));
		anuncioLabel.setFont(new Font("Verdana", Font.BOLD, 28));
		anuncioLabel.setBounds(10, 340, 486, 60);
		contentPane.add(anuncioLabel);
		
		JLabel imagenLabel = new JLabel("");
		imagenLabel.setBounds(10, 67, 446, 270);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/header.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(imagenLabel.getWidth(), imagenLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		imagenLabel.setIcon(iconoAjustado2);
		contentPane.add(imagenLabel);
		
		JLabel precioLabel = new JLabel("59,99€");
		precioLabel.setForeground(Color.GREEN);
		precioLabel.setFont(new Font("Verdana", Font.BOLD, 28));
		precioLabel.setBackground(new Color(0, 204, 0));
		precioLabel.setBounds(10, 392, 122, 49);
		contentPane.add(precioLabel);
		
		JButton comprarButton = new JButton("Comprar");
		comprarButton.setBackground(new Color(128, 128, 128));
		comprarButton.setForeground(new Color(255, 255, 255));
		comprarButton.setFont(new Font("Verdana", Font.BOLD, 15));
		comprarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pago nuevoFrame = new pago(); // Instancia la nueva ventana
	            nuevoFrame.setVisible(true); // La muestra en pantalla
			}
		});
		comprarButton.setBounds(485, 409, 138, 60);
		contentPane.add(comprarButton);
		
		JTextArea descripcionLabel = new JTextArea();
		descripcionLabel.setForeground(new Color(255, 255, 255));
		descripcionLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		descripcionLabel.setText("Black Myth: Wukong es un RPG\r\nde acción inspirado en la \r\nmitología china. Encarnarás al\r\nPredestinado, que ha de \r\nembarcarse en un viaje repleto\r\nde peligros y maravillas para\r\ndescubrir la verdad oculta \r\nacerca de una gloriosa leyenda\r\ndel pasado.");
		descripcionLabel.setBounds(466, 105, 330, 238);
		descripcionLabel.setOpaque(false);

		contentPane.add(descripcionLabel);
		
		JLabel fondoLabel = new JLabel("");
		fondoLabel.setIcon(new ImageIcon(Juego2.class.getResource("/imagenes/fondo.png")));
		fondoLabel.setBounds(0, 0, 806, 495);
		contentPane.add(fondoLabel);
	}
}