package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Juego9 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego9 frame = new Juego9();
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
	public Juego9() {
		setBounds(100, 100, 732, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Super Mario Bros Wonder  Comprar - Seminuevo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(27, 370, 491, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Super Mario Bros Wonder");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(27, 315, 255, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("59€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(285, 320, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("49€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(528, 375, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JTextPane txtpnCompraElVideojuego = new JTextPane();
		txtpnCompraElVideojuego.setText("Compra el videojuego Super Mario Bros. Wonder para Nintendo Switch y juega como nunca antes a este clásico de plataformas con nuevos elementos que cambiarán tu punto de vista.\r\n¡El estilo de juego de desplazamiento lateral, todo un clásico de Mario, vivirá un cambio radical gracias a la incorporación de las Flores Maravilla! Estos objetos dan pie a momentos espectaculares e increíbles: desde tuberías que cobran vida, hasta la posibilidad de arrasar con todo convirtiéndote en una gigantesca bola de pinchos. ¡Descubre un montón de acontecimientos inesperados!");
		txtpnCompraElVideojuego.setForeground(Color.WHITE);
		txtpnCompraElVideojuego.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnCompraElVideojuego.setBackground(new Color(12, 15, 22));
		txtpnCompraElVideojuego.setBounds(349, 42, 335, 246);
		contentPane.add(txtpnCompraElVideojuego);
		
		JLabel lblSuperMarioBros = new JLabel("Super Mario Bros. Wonder ");
		lblSuperMarioBros.setForeground(Color.WHITE);
		lblSuperMarioBros.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblSuperMarioBros.setBounds(27, 31, 255, 34);
		contentPane.add(lblSuperMarioBros);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego9.class.getResource("/imagenes/mario1.png")));
		lblNewLabel.setBounds(10, 66, 329, 260);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(540, 315, 138, 60);
		contentPane.add(btnNewButton);
	}

}
