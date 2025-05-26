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

public class Juego7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego7 frame = new Juego7();
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
	public Juego7() {
		setBounds(100, 100, 720, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCallOfDuty = new JLabel("Call of Duty: Black Ops 6 ");
		lblCallOfDuty.setForeground(Color.WHITE);
		lblCallOfDuty.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblCallOfDuty.setBounds(12, 0, 255, 34);
		contentPane.add(lblCallOfDuty);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego7.class.getResource("/imagenes/caloduty.jpg")));
		lblNewLabel.setBounds(0, 45, 439, 261);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnCallOfDuty = new JTextPane();
		txtpnCallOfDuty.setText("Call of Duty®: Black Ops 6 es el Black Ops auténtico, con una campaña cinemática individual, la mejor experiencia Multijugador de su clase y el épico regreso de Zombis por rondas.");
		txtpnCallOfDuty.setForeground(Color.WHITE);
		txtpnCallOfDuty.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnCallOfDuty.setBackground(new Color(12, 15, 22));
		txtpnCallOfDuty.setBounds(449, 69, 239, 185);
		contentPane.add(txtpnCallOfDuty);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Call of Duty®: Black Ops 6");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(12, 317, 350, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(372, 322, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar Call of Duty®: Black Ops 6 - Edición de Archivo");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(12, 378, 547, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("79,99€ ");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(569, 383, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(514, 294, 138, 60);
		contentPane.add(btnNewButton);
	}

}
