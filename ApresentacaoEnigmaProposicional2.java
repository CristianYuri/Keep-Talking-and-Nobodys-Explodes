
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
import java.awt.TextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ApresentacaoEnigmaProposicional2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApresentacaoEnigmaProposicional2 window = new ApresentacaoEnigmaProposicional2();
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
	public ApresentacaoEnigmaProposicional2() {
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
		
		TextArea textArea = new TextArea();
		textArea.setText("Analyze the propositions and check the alternative\r\ncorrect according to the connectivity truth table\r\nlogical.");
		textArea.setForeground(new Color(255, 255, 102));
		textArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 29, 334, 66);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("ENIGMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ARMADO");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setBounds(279, 2, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnE = new JRadioButton("3+1=4 e 2+3=5");
		rdbtnE.setBounds(20, 101, 163, 23);
		frame.getContentPane().add(rdbtnE);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("6 > 2 e 7 < 3");
		rdbtnNewRadioButton_1.setBounds(20, 127, 175, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("2 = 3 e 5 < 0");
		rdbtnNewRadioButton_2.setBounds(20, 153, 214, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("3=5 e 10>9");
		rdbtnNewRadioButton_3.setBounds(20, 175, 264, 20);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	}

}
