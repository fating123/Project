package classEx2;

public class avgjob extends Thread  {
	
	
	@Override
	public void run() {
		
		sumjob sj=new sumjob();
		 int avg= sj.sum/10;
		 System.out.println("avg is "+avg);
		
	}

}
