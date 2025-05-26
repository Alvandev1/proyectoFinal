package proyecto;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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
		
		setBounds(100, 100, 644, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 293, 185);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/Monster Hunter Wilds.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(291, 0, 225, 230);
		ImageIcon icono3=new ImageIcon(PlayStation.class.getResource("/imagenes/MonsterHunter.jpg"));
		Image imagen3 = icono3.getImage().getScaledInstance( lblNewLabel_1 .getWidth(),  lblNewLabel_1 .getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado3 = new ImageIcon(imagen3);
		lblNewLabel_1.setIcon(iconoAjustado3);
		contentPane.add(lblNewLabel_1);
	}

}
