	package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Juego6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego6 frame = new Juego6();
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
	public Juego6() {
		setBounds(100, 100, 719, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(20, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar NBA 2K25 Tournament Edition");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(15, 330, 377, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprar NBA 2K25 All-Star Edition");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(15, 384, 377, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar NBA 2K25 Standard Edition");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(15, 275, 335, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(371, 280, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("79,99€ ");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(387, 335, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("99,99€ ");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(358, 389, 69, 60);
		contentPane.add(lblNewLabel_3_2);
		
		JTextPane txtpnConvirteteEnEl = new JTextPane();
		txtpnConvirteteEnEl.setText("Conviértete en el rey de la pista con autenticidad y realismo con ProPLAY™, que te permitirá tener el control absoluto de tu juego en NBA 2K25. Define tu legado en Mi CARRERA, MyTEAM, Mi NBA y La W.");
		txtpnConvirteteEnEl.setForeground(Color.WHITE);
		txtpnConvirteteEnEl.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnConvirteteEnEl.setBackground(new Color(12, 15, 22));
		txtpnConvirteteEnEl.setBounds(409, 80, 284, 185);
		contentPane.add(txtpnConvirteteEnEl);
		
		JLabel lblNbak = new JLabel("NBA 2K25");
		lblNbak.setForeground(Color.WHITE);
		lblNbak.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNbak.setBounds(17, 11, 255, 34);
		contentPane.add(lblNbak);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Juego6.class.getResource("/imagenes/nbaks.jpg")));
		lblNewLabel.setBounds(5, 56, 394, 209);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Comprar Paquete NBA 2K25 x TopSpin 2K25. PACK");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2_1.setBounds(15, 437, 482, 70);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("98,78€");
		lblNewLabel_3_2_1.setForeground(Color.GREEN);
		lblNewLabel_3_2_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2_1.setBounds(507, 442, 69, 60);
		contentPane.add(lblNewLabel_3_2_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(531, 490, 138, 60);
		contentPane.add(btnNewButton);
	}

}
