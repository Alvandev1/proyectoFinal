package proyecto;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Juego1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego1 frame = new Juego1();
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
	public Juego1() {
		
		setBounds(100, 100, 810, 790);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(19, 22, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monster Hunter Wilds");
		lblNewLabel.setBounds(63, 49, 425, 70);
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblSienteLaFuerza = new JLabel("Siente la fuerza desbocada, salvaje e imparable \r\n");
		lblSienteLaFuerza.setHorizontalAlignment(SwingConstants.CENTER);
		lblSienteLaFuerza.setForeground(Color.WHITE);
		lblSienteLaFuerza.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblSienteLaFuerza.setBounds(434, 130, 275, 60);
		contentPane.add(lblSienteLaFuerza);
		
		JLabel lblDeLaNaturaleza = new JLabel("de la naturaleza en entornos que se transforman drásticamente");
		lblDeLaNaturaleza.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeLaNaturaleza.setForeground(Color.WHITE);
		lblDeLaNaturaleza.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblDeLaNaturaleza.setBounds(336, 158, 476, 60);
		contentPane.add(lblDeLaNaturaleza);
		
		JLabel lblDeUnMomento = new JLabel(" de un momento a otro. Esta es una historia de monstruos y humanos,");
		lblDeUnMomento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeUnMomento.setForeground(Color.WHITE);
		lblDeUnMomento.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblDeUnMomento.setBounds(336, 186, 476, 60);
		contentPane.add(lblDeUnMomento);
		
		JLabel lblYSusDificultades = new JLabel(" y sus dificultades para coexistir en armonía en un mundo de dualidades.");
		lblYSusDificultades.setHorizontalAlignment(SwingConstants.CENTER);
		lblYSusDificultades.setForeground(Color.WHITE);
		lblYSusDificultades.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblYSusDificultades.setBounds(346, 212, 463, 60);
		contentPane.add(lblYSusDificultades);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Monster Hunter Wilds");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(37, 368, 296, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar Monster Hunter Wilds: Edición Deluxe");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(37, 418, 451, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprar Monster Hunter Wilds: Edición Deluxe Prémium");
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_1.setBounds(37, 469, 524, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Comprar Monster Hunter Wilds: Pase de complementos de aspecto");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_2.setBounds(37, 527, 616, 70);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setLabelFor(this);
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(356, 373, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("89,99€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(492, 423, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("109,99€");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(594, 474, 69, 60);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("49,99€ ");
		lblNewLabel_3_3.setForeground(Color.GREEN);
		lblNewLabel_3_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_3.setBounds(663, 538, 69, 60);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(37, 103, 333, 254);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/MonsterHunter.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel_4.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(60, 608, 182, 52);
		contentPane.add(btnNewButton);
	
	}
}
