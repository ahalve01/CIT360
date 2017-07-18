package connections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class HttpUrl {
	private static Scanner input;
	
	public static void main(String args[]) throws IOException{
		input = new Scanner(System.in);
		String username = null;
		String password = null;
		boolean theError = true;
		do{
			try{
				System.out.println("Enter Username Name: ");
				username = (input.next());
				theError = false;
				
			}catch (Exception e){
				System.out.println("Error!");
				input.reset();
			}while (theError);
		
	
		
		String urlLink = "http://localhost/Testing/index.php?username="+username+"&password="+password;
		URL url = new URL(urlLink);
		HttpURLConnection connect = (HttpURLConnection)url.openConnection();
		connect.setRequestMethod("GET");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
		StringBuffer buffy = new StringBuffer();
		String line;
		buffy.append(line);
		
		input.close();
		System.out.println(buffy.toString());
		}
	}

	

	

		
