package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private CalcModel theModel;
	private theView view;
	
	public Controller(theView view, CalcModel theModel){
		this.view = view;
		this.theModel = theModel;
		this.view.addListener(new iHearYou());
	}
	class iHearYou implements ActionListener{
		public void actionPerforemed(ActionEvent e){
			int numberOne, numberTwo = 0;
			
			try{
				numberOne = view.getNumberOne();
				numberTwo = view.getNumberTwo();
				
				theModel.addNumbers(numberOne, numberTwo);
			    view.setSolution(theModel.getValue());
			}
			catch(Exception ex){
				System.out.println(ex);
				view.displayError("You need to add two numbers please.");
						
			}
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
