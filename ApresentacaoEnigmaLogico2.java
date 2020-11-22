/*Disciplina: Programação Orientada a Objetos
 *  Professor: Marcel Hugo
 * 
 *  Equipe 10
 *  Marcella Coelho Brito Nunes
 *  Lorena Ricardo de Oliveira
 *  Cristian Yuri Machota
 *  
 *  Data: 22/11/2020
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JRadioButton;

public class ApresentacaoEnigmaLogico2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApresentacaoEnigmaLogico2 window = new ApresentacaoEnigmaLogico2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApresentacaoEnigmaLogico2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENIGMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setText("Lorena's age is twice that of Cristian.\r\nIn 15 years, Cristian's age plus Lorena's\r\nwill be 45 years old. We can say that:");
		textArea.setForeground(new Color(255, 255, 102));
		textArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 20, 334, 85);
		frame.getContentPane().add(textArea);
		
		JRadioButton rdbtnHojelorenaTem = new JRadioButton("Today, Lorena is 10 years old\r\n");
		rdbtnHojelorenaTem.setBounds(20, 99, 296, 23);
		frame.getContentPane().add(rdbtnHojelorenaTem);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Today,Cristian is 10 years old");
		rdbtnNewRadioButton_1.setBounds(20, 125, 296, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Today, Lorena is 15 years old");
		rdbtnNewRadioButton_2.setBounds(20, 151, 296, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Today as age add up to 25 years");
		rdbtnNewRadioButton_3.setBounds(20, 173, 296, 20);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("ARMADO");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setBounds(279, 2, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
