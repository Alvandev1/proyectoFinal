package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

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
		setBounds(100, 100, 722, 491);
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
		
		JLabel lblNewLabel_3 = new JLabel("69,99€");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3.setBackground(new Color(51, 255, 51));
		lblNewLabel_3.setBounds(464, 209, 69, 60);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("69,99€");
		lblNewLabel_3_1.setForeground(Color.GREEN);
		lblNewLabel_3_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_1.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_1.setBounds(464, 252, 69, 60);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("69,99€");
		lblNewLabel_3_2.setForeground(Color.GREEN);
		lblNewLabel_3_2.setFont(new Font("Rockwell Condensed", Font.PLAIN, 28));
		lblNewLabel_3_2.setBackground(new Color(51, 255, 51));
		lblNewLabel_3_2.setBounds(464, 337, 69, 60);
		contentPane.add(lblNewLabel_3_2);
	}

}
