package proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PC frame = new PC();
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
	public PC() {
		setBounds(100, 100, 715, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PC.class.getResource("/imagenes/gtaaaaa.jpg")));
		lblNewLabel.setBounds(0, 0, 362, 194);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PC.class.getResource("/imagenes/gtaaa.jpg")));
		lblNewLabel_1.setBounds(290, -28, 532, 304);
		contentPane.add(lblNewLabel_1);
		

		JButton btnNewButton = new JButton("Comprar "); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego10 Juego10Ventana = new Juego10();
		        Juego10Ventana.setVisible(true);
		 
			}
		});
		btnNewButton.setBounds(32, 383, 151, 88);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnNewButton);
	}

}
