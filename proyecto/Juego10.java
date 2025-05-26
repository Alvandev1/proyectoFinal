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

public class Juego10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego10 frame = new Juego10();
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
	public Juego10() {

		setBounds(100, 100, 739, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrandTheftAuto = new JLabel("Grand Theft Auto V");
		lblGrandTheftAuto.setForeground(Color.WHITE);
		lblGrandTheftAuto.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblGrandTheftAuto.setBounds(27, 25, 255, 34);
		contentPane.add(lblGrandTheftAuto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego10.class.getResource("/imagenes/gtaaa.jpg")));
		lblNewLabel.setBounds(0, 35, 416, 307);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnCuandoUnJoven = new JTextPane();
		txtpnCuandoUnJoven.setText("Cuando un joven estafador callejero, un ladrón de bancos retirado y un psicópata aterrador se ven involucrados con lo peor y más desquiciado del mundo criminal, el gobierno de los EE. UU. y la industria del espectáculo, deberán llevar a cabo una serie de peligrosos golpes para sobrevivir en una ciudad implacable en la que no pueden confiar en nadie. Y mucho menos los unos en los otros.\r\nLos jugadores actuales de PC pueden transferir su progreso del Modo Historia de GTAV y sus personajes y progreso de GTA Online mediante una tranferencia única desde la versión original de GTAV a GTAV Enhanced.");
		txtpnCuandoUnJoven.setForeground(Color.WHITE);
		txtpnCuandoUnJoven.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnCuandoUnJoven.setBackground(new Color(12, 15, 22));
		txtpnCuandoUnJoven.setBounds(414, 25, 299, 307);
		contentPane.add(txtpnCuandoUnJoven);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Grand Theft Auto V Enhanced");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(27, 360, 377, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("29,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(399, 365, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar Grand Theft Auto V Enhanced & Great White Shark Card");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(27, 415, 631, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("44,99€ ");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(644, 420, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(522, 486, 176, 35);
		contentPane.add(btnNewButton);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(336, 486, 176, 35);
		contentPane.add(btnComprar);
	}
}
