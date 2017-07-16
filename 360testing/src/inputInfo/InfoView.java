package inputInfo;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel fieldLabel = new JLabel("Enter name:");
	private JTextField name = new JTextField(20);
	private JLabel fieldLabel2 = new JLabel("Enter email:");
	private JTextField email = new JTextField(20);
	private JButton enterInfo = new JButton("Enter");
	private JTextField combineFields = new JTextField(30);
	
	InfoView(){
		JPanel infoView = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		
		infoView.add(fieldLabel);
		infoView.add(name);
		infoView.add(fieldLabel2);
		infoView.add(email);
		infoView.add(enterInfo);
		infoView.add(combineFields);
		
		this.add(infoView);
	}

	//public JTextField getName() {
		//return name;
	//}

	//public void setName(JTextField name) {
	//	this.name = name;
	//}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getCombineFields() {
		return combineFields;
	}

	public void setCombineFields(JTextField combineFields) {
		this.combineFields = combineFields;
	}
	
	void addInfoListener(ActionListener listenForEnterInfo){
		enterInfo.addActionListener(listenForEnterInfo);
	}
	

	
}
