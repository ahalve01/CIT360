package json;

import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class JSONmovies{
	
	public static void main(String[] args){
		
		System.out.println(movies());
		System.out.println(getIt());
		JSONWriter(movies(),getIt());
	}
	public static JSONObject movies(){
		JSONObject listMovies = new JSONObject();
		
			listMovies.put("movie:", "Lord of the Rings");
			listMovies.put("rank:", "1st");
			listMovies.put("year:", "2001");
			listMovies.put("rated: ", "PG-13");
			
			listMovies.remove("rated:");
			
			return listMovies;
	}
	public static JSONArray getIt(){
		JSONArray getMovies = new JSONArray();
		
		getMovies.add("Pirates of the Caribbean");
		getMovies.add("Montey Python");
		getMovies.add("Harry Potter");
		getMovies.add("Moana");
		getMovies.add("Beauty and the Beast");
		
		getMovies.remove(1);
		return getMovies;
	}
	
	public static void JSONWriter(JSONObject movies, JSONArray getIt){
		
		movies.put("ExtraMovies:", getIt);
		try(
			FileWriter File = new FileWriter("C:\\Users\\Halverson\\workspace\\360testing\\src\\json\\JSONtest.json")	){
			File.write(movies.toJSONString());
			File.close();
		}catch(IOException IOException){
			IOException.printStackTrace();
		}
	}
	
}