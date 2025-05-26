package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Juego2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego2 frame = new Juego2();
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
	public Juego2() {
		setBounds(100, 100, 727, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(12, 15, 22));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEaSportsFc = new JLabel("EA SPORTS FC™ 25");
		lblEaSportsFc.setBounds(43, 24, 200, 34);
		lblEaSportsFc.setForeground(Color.WHITE);
		lblEaSportsFc.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		contentPane.add(lblEaSportsFc);
		
		JLabel lblEaSportsFc_1 = new JLabel("EA SPORTS FC™ 25 te ofrece más formas de ganar por el club. ");
		lblEaSportsFc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEaSportsFc_1.setForeground(Color.WHITE);
		lblEaSportsFc_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblEaSportsFc_1.setBounds(306, 93, 392, 27);
		contentPane.add(lblEaSportsFc_1);
		
		JLabel lblFormaEquipoCon = new JLabel("Forma equipo con tus colegas en tus modos favoritos ");
		lblFormaEquipoCon.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormaEquipoCon.setForeground(Color.WHITE);
		lblFormaEquipoCon.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblFormaEquipoCon.setBounds(316, 116, 373, 27);
		contentPane.add(lblFormaEquipoCon);
		
		JLabel lblConElNuevo = new JLabel("con el nuevo Rush de 5 contra 5 y lleva a tu club a la victoria ");
		lblConElNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		lblConElNuevo.setForeground(Color.WHITE);
		lblConElNuevo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblConElNuevo.setBounds(278, 131, 471, 34);
		contentPane.add(lblConElNuevo);
		
		JLabel lblGraciasAUn = new JLabel("gracias a un control táctico más realista que nunca con FC IQ.");
		lblGraciasAUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasAUn.setForeground(Color.WHITE);
		lblGraciasAUn.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		lblGraciasAUn.setBounds(266, 154, 483, 27);
		contentPane.add(lblGraciasAUn);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar EA SPORTS FC™ 25");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(10, 285, 296, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprar EA SPORTS FC™ 25 Ultimate Edition");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1_1.setEnabled(false);
		lblNewLabel_1_1.setBounds(10, 351, 439, 70);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 55, 301, 233);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/fifa1.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(311, 291, 69, 49);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("99,99€");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(454, 361, 69, 60);
		contentPane.add(lblNewLabel_3_2);
	}

}
