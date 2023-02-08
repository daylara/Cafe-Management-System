import java.util.ArrayList;
import java.util.HashMap;

public class Table {
	public int Number;
	public ArrayList<String> Ordered = new ArrayList<String>();
	public int Sum;
	public int isFull;
	
	
	public Table(int number, ArrayList<String> ordered, int sum, int IsFull) {
		Number = number;
		Ordered = ordered;
		Sum = sum;
		isFull = IsFull;
	}


	public int getNumber() {
		return Number;
	}


	public ArrayList<String> getOrdered() {
		return Ordered;
	}


	public void addOrder(String Product)
	{
		Ordered.add(Product);
	}
	
	public void CancelOrder(String Product)
	{
		Ordered.remove(Product);
	}

	public int getSum() {
		return Sum;
	}


	public Boolean getIsFull() {
		Boolean flag= false;
		if(isFull==4)
			flag=true;
		else
			flag=false;
		return flag;
	}


	public void setIsFull(int isFull) {
		this.isFull = isFull;
	}
	
	public int CalculateSumAndGetPaid(HashMap<String, Integer> Products)
	{

		
		for (int i = 0; i < Ordered.size(); i++) {
			int value=Products.get(Ordered.get(i));
			Sum=Sum+value;
		}
		return Sum;
	}
}
