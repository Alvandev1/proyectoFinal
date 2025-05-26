package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Juego3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego3 frame = new Juego3();
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
	public Juego3() {
		setBounds(100, 100, 736, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(12, 15, 22));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBlackMythWukong = new JLabel("Black Myth: Wukong");
		lblBlackMythWukong.setBounds(29, 11, 200, 34);
		lblBlackMythWukong.setForeground(Color.WHITE);
		lblBlackMythWukong.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		contentPane.add(lblBlackMythWukong);
		
		JLabel lblNewLabel_3 = new JLabel("59,99€");
		lblNewLabel_3.setBounds(295, 264, 69, 60);
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("69,99€");
		lblNewLabel_3_2.setBounds(489, 332, 69, 60);
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		contentPane.add(lblNewLabel_3_2);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(511, 100, 1, 1);
		contentPane.add(verticalGlue);
		
		JTextPane txtpnBlackMythWukong = new JTextPane();
		txtpnBlackMythWukong.setForeground(new Color(255, 255, 255));
		txtpnBlackMythWukong.setBackground(new Color(12, 15, 22));
		txtpnBlackMythWukong.setFont(new Font("Rockwell Condensed", Font.PLAIN, 17));
		txtpnBlackMythWukong.setText(" Black Myth: Wukong es un RPG de acción inspirado en\r\n la mitología china. Encarnarás al Predestinado, que ha de\r\n   embarcarse en un viaje repleto de peligros y maravillas\r\n         para descubrir la verdad oculta acerca de \r\n              una gloriosa leyenda del pasado.");
		txtpnBlackMythWukong.setBounds(327, 72, 347, 119);
		contentPane.add(txtpnBlackMythWukong);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 45, 301, 199);
		ImageIcon icono2=new ImageIcon(PlayStation.class.getResource("/imagenes/header.jpg"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblNewLabel.setIcon(iconoAjustado2);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Black Myth: Wukong");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(10, 259, 296, 70);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comprar Black Myth: Wukong Edición Digital Deluxe");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(3, 327, 492, 70);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(512, 390, 138, 60);
		contentPane.add(btnNewButton);
	}
}
