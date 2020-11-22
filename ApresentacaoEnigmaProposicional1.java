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
import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JRadioButton;

public class ApresentacaoEnigmaProposicional1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApresentacaoEnigmaProposicional1 window = new ApresentacaoEnigmaProposicional1();
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
	public ApresentacaoEnigmaProposicional1() {
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
		
		JLabel lblNewLabel_1 = new JLabel("ARMADO");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setBounds(279, 2, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		TextArea textArea = new TextArea();
		textArea.setText("Using Modus Tollens ruler, answer\r\n1=If i play chess, then i win the game.\r\n2=I don\u00B4t win the game\r\nSo, we can be concluded that:");
		textArea.setForeground(new Color(255, 255, 102));
		textArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 20, 334, 85);
		frame.getContentPane().add(textArea);
		
		JRadioButton rdbtnJogoXadrez = new JRadioButton("I play chess");
		rdbtnJogoXadrez.setBounds(20, 99, 296, 23);
		frame.getContentPane().add(rdbtnJogoXadrez);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("I don\u00B4t play chess");
		rdbtnNewRadioButton_1.setBounds(20, 125, 296, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("I win the game");
		rdbtnNewRadioButton_2.setBounds(20, 151, 296, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("None of the above");
		rdbtnNewRadioButton_3.setBounds(20, 173, 296, 20);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	}

}
