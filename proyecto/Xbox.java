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

public class Xbox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Xbox frame = new Xbox();
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
	public Xbox() {
	
		setBounds(100, 100, 532, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Xbox.class.getResource("/imagenes/asesino1.jpg")));
		lblNewLabel.setBounds(0, 0, 555, 340);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Comprar "); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego4 Juego4Ventana = new Juego4();
		        Juego4Ventana.setVisible(true);
		 
			}
		});
		btnNewButton.setBounds(32, 383, 151, 88);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD));
		contentPane.add(btnNewButton);
	}

}
