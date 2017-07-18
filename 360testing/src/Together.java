package mvc;

public class Together {
	public static void main(String[] args){
		theView view = new theView();
		CalcModel theModel = new CalcModel();
		Controller theController = new Controller(view,theModel);
		view.setVisible(true);
	}

}
