package inheritance;

public class PassFailExam extends PassFailActivity {
	int numberOfQuestions;
	double PointsPerQuestion;
	int numberMissed;
	
	public PassFailExam(int questions, int missed, double minPassing)
	{
		super(minPassing);
	}
	
	
	public double getPointEach()
	{
		return 0;
	}
	
	public int getNumMissed()
	{
		return 0;
	}
}
