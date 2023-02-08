import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
	static ArrayList<String[]> Products = new ArrayList<String[]>();
	
	public ArrayList<String[]> Reader()
	 {
		 
		 String line = "";  
		 String splitBy = ";";
		 Boolean flag= false;
		 try   
		 {  
		 //parsing a CSV file into BufferedReader class constructor  
	
		 BufferedReader br = new BufferedReader(new FileReader("C:/Users/dilar/Downloads/Menu.csv/"));  
		 while ((line = br.readLine()) != null )   //returns a Boolean value  
		 {  
		 String[] items = line.split(splitBy);
		 Products.add(items);
		 }  
		 }   
		 catch (IOException e)   
		 {  
		 e.printStackTrace();  
		 }
		return Products;

	 }

}
