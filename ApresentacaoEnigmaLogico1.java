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
import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ApresentacaoEnigmaLogico1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApresentacaoEnigmaLogico1 window = new ApresentacaoEnigmaLogico1();
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
	public ApresentacaoEnigmaLogico1() {
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
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setForeground(new Color(255, 255, 102));
		textArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		textArea.setText("Draw or read. Work or not draw. \r\nPlay the guitar or don't read.\r\nNow, Don't play guitar.");
		textArea.setBounds(0, 38, 334, 66);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("PUZZLE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 9, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Readand Work");
		rdbtnNewRadioButton.setBounds(20, 110, 163, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Work and Draw");
		rdbtnNewRadioButton_1.setBounds(20, 136, 175, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Don\u00B4t work and draw");
		rdbtnNewRadioButton_2.setBounds(20, 162, 214, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Read and don\u00B4t work");
		rdbtnNewRadioButton_3.setBounds(20, 184, 264, 20);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("ARMED");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblNewLabel_1.setBounds(279, 11, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
