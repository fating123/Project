package classEx2;

public class sumjob extends Thread  {
	static int sum=0;
	@Override
	public void run() {
		
		for(int i=0;i<3000000;i++){
			
			sum=sum+i;
		}
		
		System.out.println("sum ="+sum);
		
		
	}

}
