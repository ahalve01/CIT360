package mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class theView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField numberOne = new JTextField(10);
	private JLabel addIt = new JLabel ("+");
	private JTextField numberTwo = new JTextField(10);
	private JButton calculate = new JButton("Equals");
	private JTextField solution = new JTextField(20);
	
	theView(){
		JPanel thePanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,300);
		
		thePanel.add(numberOne);
		thePanel.add(addIt);
		thePanel.add(numberTwo);
		thePanel.add(calculate);
		thePanel.add(solution);
	}
	public int getNumberOne(){
		return Integer.parseInt(numberOne.getText());
	}
	
	public int getNumberTwo(){
		return Integer.parseInt(numberTwo.getText());
		}
	
	public int getSolution(){
		return Integer.parseInt(solution.getText());
	}
	
	public void setSolution(int solutionOf){
		solution.setText(Integer.toString(solutionOf));
	}
	void addListener(ActionListener listenForButton){
		calculate.addActionListener(listenForButton);
	}
	
	void displayError(String error){
		JOptionPane.showMessageDialog(this, error);
	}
}
