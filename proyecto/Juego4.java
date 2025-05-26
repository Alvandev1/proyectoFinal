package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Juego4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego4 frame = new Juego4();
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
	public Juego4() {

		setBounds(100, 100, 670, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAssassinsCreedShadows = new JLabel("Assassin’s Creed Shadows ");
		lblAssassinsCreedShadows.setBounds(27, 11, 255, 34);
		lblAssassinsCreedShadows.setForeground(Color.WHITE);
		lblAssassinsCreedShadows.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		contentPane.add(lblAssassinsCreedShadows);
		
		JTextPane txtpnsumrgeteEnUna = new JTextPane();
		txtpnsumrgeteEnUna.setText("¡Sumérgete en una épica historia de acción y aventura \r\nambientada en el Japón feudal! Explora un fascinante \r\nmundo abierto durante una época turbulenta en la piel\r\n de una letal Assassin shinobi y un legendario y poderoso samurái.");
		txtpnsumrgeteEnUna.setForeground(Color.WHITE);
		txtpnsumrgeteEnUna.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnsumrgeteEnUna.setBackground(new Color(12, 15, 22));
		txtpnsumrgeteEnUna.setBounds(281, 71, 347, 119);
		contentPane.add(txtpnsumrgeteEnUna);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Assassin's Creed Shadows");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(27, 253, 335, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar Assassin's Creed Shadows - Digital Deluxe Edition");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(27, 308, 574, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprar Assassin's Creed Bundle PACK");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(27, 362, 377, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(364, 258, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("89,99€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(575, 313, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("446,24€");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(399, 367, 69, 60);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 68, 261, 164);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/asesinn.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(468, 442, 176, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setBounds(281, 443, 176, 35);
		contentPane.add(btnNewButton_1);
	}
}
