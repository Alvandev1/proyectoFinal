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

public class Juego5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego5 frame = new Juego5();
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
	public Juego5() {
		setBounds(100, 100, 791, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheElderScrolls = new JLabel("The Elder Scrolls IV: Oblivion Remastered ");
		lblTheElderScrolls.setBounds(25, 11, 407, 34);
		lblTheElderScrolls.setForeground(Color.WHITE);
		lblTheElderScrolls.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		contentPane.add(lblTheElderScrolls);
		
		JTextPane txtpnExploraCyrodiilComo = new JTextPane();
		txtpnExploraCyrodiilComo.setText("Explora Cyrodiil como nunca con unos gráficos impresionantes y una jugabilidad mejorada en The Elder Scrolls IV: Oblivion™ Remastered.");
		txtpnExploraCyrodiilComo.setForeground(Color.WHITE);
		txtpnExploraCyrodiilComo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnExploraCyrodiilComo.setBackground(new Color(12, 15, 22));
		txtpnExploraCyrodiilComo.setBounds(471, 115, 289, 115);
		contentPane.add(txtpnExploraCyrodiilComo);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar The Elder Scrolls IV: Oblivion Remastered");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(25, 283, 491, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar The Elder Scrolls IV: Oblivion Remastered - Deluxe Edition");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(25, 349, 632, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("The Elder Scrolls IV: Oblivion Remastered - Deluxe Upgrade");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(25, 418, 564, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("54,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(507, 288, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("64,99€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(667, 354, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("9,99€");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(599, 423, 69, 60);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego5.class.getResource("/imagenes/oblivion.jpg")));
		lblNewLabel.setBounds(10, 56, 451, 232);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(598, 259, 138, 60);
		contentPane.add(btnNewButton);
	}

}
