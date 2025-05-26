package proyecto;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PlayStation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayStation frame = new PlayStation();
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
	public PlayStation() {
		
		setBounds(100, 100, 486, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(20, 66, 96, 90);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/images.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(126, 66, 106, 90);
		ImageIcon icono3=new ImageIcon(PlayStation.class.getResource("/imagenes/Final Fantasy Vll.png"));
		Image imagen3 = icono3.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado3 = new ImageIcon(imagen3);
		lblNewLabel_1.setIcon(iconoAjustado3);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(229, 72, 106, 84);
		ImageIcon icono4=new ImageIcon(PlayStation.class.getResource("/imagenes/PGA 2K23.png"));
		Image imagen4 = icono4.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado4 = new ImageIcon(imagen4);
		lblNewLabel_2.setIcon(iconoAjustado4);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(364, 66, 96, 90);
		ImageIcon icono5=new ImageIcon(PlayStation.class.getResource("/imagenes/Fi24.jpg"));
		Image imagen5 = icono5.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado5 = new ImageIcon(imagen5);
		lblNewLabel_3.setIcon(iconoAjustado5);
		contentPane.add(lblNewLabel_3);
	}

}
