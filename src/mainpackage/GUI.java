package mainpackage;
//Garcia Jon


import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;





public class GUI {

	private static final AbstractButton Initial = null;
	private static final AbstractButton Years = null;
	private static final AbstractButton Interest = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInitialAnnualInvestment = new JLabel("Initial Annual Investment");
		lblInitialAnnualInvestment.setBounds(10, 26, 148, 14);
		frame.getContentPane().add(lblInitialAnnualInvestment);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(10, 49, 46, 14);
		frame.getContentPane().add(lblYears);
		
		JLabel lblNewLabel = new JLabel("Annual Intrest Rate");
		lblNewLabel.setBounds(10, 74, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Future Value");
		lblNewLabel_1.setBounds(10, 99, 95, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(188, 23, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 46, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(188, 71, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(188, 99, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(188, 200, 89, 23);
		frame.getContentPane().add(btnCalculate);
	
	
		btnCalculate.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		double starting = Double.parseDouble(textField.getText());
	
		double years = Double.parseDouble(textField_1.getText());
		
		double rate = Double.parseDouble(textField_2.getText());
		
		double total;
		
		Calc tester = new Calc();
		
		total = tester.Expected_Value(starting, years, rate);
		
		textField_3.setText("$" + Math.round(total));
	}
});
	}}
