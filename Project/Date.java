
public class Date {
	int Day;
	int Month;
	int Year;
	
	
	
	
	
	public Date() {
		Day = 1;
		Month = 1;
		Year = 2022;
	}

	public String Print_Date()
	{
		String date=Integer.toString(Day)+"."+Integer.toString(Month)+"."+Integer.toString(Year);
		return date;
	}



	public int getDay() {
		return Day;
	}





	public void setDay() {
		Day++;
		if(Day==31) {
			Day=1;
			setMonth();
		}
	}





	public int getMonth() {
		return Month;
	}





	public void setMonth() {
		Month++;
		if(Month==13)
		{
			Month=1;
			setYear();
		}
	}





	public int getYear() {
		return Year;
	}





	public void setYear() {
		Year++;
	}
	
	
	
}
