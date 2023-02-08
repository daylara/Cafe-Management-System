import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class IncomeExpense {
	int Income;
	int Expense;
	
	
	public int getIncome() {
		return Income;
	}

	public void setIncome(int income) {
		Income = income;
	}

	public int getExpense() {
		return Expense;
	}

	public void setExpense(int expense) {
		Expense = expense;
	}

	public IncomeExpense() {
		Income = 0;
		Expense = 0;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public int Income(ArrayList<String[]> Incomelist,HashMap<String, Integer> Products)
	{
		for (int i = 0; i < Incomelist.size(); i++) {
			Income=Income+Products.get(Incomelist.get(i));
		}

		return Income;
	}
	
	public int Employee_Expense()
	{
		
		ArrayList<String[]> EmployeeList=new ArrayList<String[]>();
		EmployeeList=Human.read_csv();
		int counter=0;
		for (int i = 0; i < EmployeeList.size(); i++) {
			if(EmployeeList.get(i)[2].equals("Waiter")||EmployeeList.get(i)[2].equals("Chef")||EmployeeList.get(i)[2].equals("Barista"));
			{
				counter++;
			}
		}
		Expense=Expense+counter*1000;//Maaþlarý 1000 olarak düþündüm istersen deðiþtiririz.
		return Expense;
	}
	
	public void addItem(Date date, int Income, int Expense) 
	{
	   try {
		BufferedReader itemsCSV = new BufferedReader(new FileReader("ForBoss.csv"));
		String dataRow = itemsCSV.readLine();
		 
		String[] rows = new String[1];
		String[] dataArray = new String[11];

		 
		while (dataRow != null){
		   for(int x = 0; x < 1; x++){
		      dataArray = dataRow.split("\n");
		      rows[x] = dataArray[0];
		      dataRow = itemsCSV.readLine(); // Read next line of data.
		   }
		}
		 
		FileWriter writer = new FileWriter("ForBoss.csv");
		     
		for(int p = 0; p<rows.length; p++){
		   writer.append(rows[p]);
		}
		String item=Integer.toString(date.getDay())+"."+Integer.toString(date.getMonth())+"."+Integer.toString(date.getYear());
		writer.append('\n');
		writer.append(item);
  
		       
//		          writer.flush();
		writer.close();
	  }
	  catch(IOException e)
	  {
	    e.printStackTrace();
	  } 
	   
	   
	}
	
}
