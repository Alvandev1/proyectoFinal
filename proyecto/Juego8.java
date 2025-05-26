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

public class Juego8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego8 frame = new Juego8();
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
	public Juego8() {
		setBounds(100, 100, 744, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Super Mario Party Jamboree Comprar - Seminuevo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(47, 364, 499, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Super Mario Party Jamboree");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(47, 315, 335, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("59€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(327, 320, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("54€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(537, 369, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JTextPane txtpnCompraSuperMario = new JTextPane();
		txtpnCompraSuperMario.setText("Compra Super Mario Party Jamboree para la consola Switch y prepárate para una fiesta como ninguna con más de 110 minijuegos y hasta 7 tableros, ¡el mayor número hasta la fecha en una entrega de Mario Party!.\r\n\r\nDescubre siete tableros en total: déjate llevar por el flujo de las mareas en la isla Goomba; lánzate a buscar estrellas en las Galerías Arcoíris; regresa a los clásicos entornos del mundo del Oeste y el castillo arcoíris de Mario, procedentes de entregas anteriores, ¡y más!");
		txtpnCompraSuperMario.setForeground(Color.WHITE);
		txtpnCompraSuperMario.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnCompraSuperMario.setBackground(new Color(12, 15, 22));
		txtpnCompraSuperMario.setBounds(351, 54, 368, 232);
		contentPane.add(txtpnCompraSuperMario);
		
		JLabel lblSuperMarioParty = new JLabel("Super Mario Party Jamboree ");
		lblSuperMarioParty.setForeground(Color.WHITE);
		lblSuperMarioParty.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblSuperMarioParty.setBounds(27, 22, 289, 34);
		contentPane.add(lblSuperMarioParty);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego8.class.getResource("/imagenes/mariooee.png")));
		lblNewLabel.setBounds(10, 54, 331, 274);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(554, 298, 138, 60);
		contentPane.add(btnNewButton);
	}

}
