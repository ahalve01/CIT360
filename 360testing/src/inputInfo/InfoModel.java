package inputInfo;

public class InfoModel {
	
	private String combineInfo;
	
	public void bringTogether(String name, String email){
		combineInfo = "Your " +name+ " and your email is: "+email;
	}
	public String getcombineInfo(){
		return combineInfo;
	}

}
