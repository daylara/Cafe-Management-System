
public class Survey {
	int Yes;
	int No;
	
	
	
	public Survey() {
		Yes = 0;
		No = 0;
	}



	public int getYes() {
		return Yes;
	}


	public int getNo() {
		return No;
	}
	
	public int Yesvote() {
		Yes++;
		return Yes;
	}


	public int Novote() {
		No++;
		return No;
	}
	
	
}
