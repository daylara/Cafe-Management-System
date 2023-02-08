import java.util.ArrayList;

public class Boss {
	
	
	
	
	
	
	
	public String Survey_Result(Survey CafeSurvey)
	{
		String MessageforBoss=Integer.toString(CafeSurvey.getYes()+CafeSurvey.Novote())+" Customer Voted "+Integer.toString(CafeSurvey.getYes())+" Yes Vote "+Integer.toString(CafeSurvey.getNo())+" No Vote";
		return MessageforBoss;
	}
}
