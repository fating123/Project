package classEx2;

public class sumavgtrigger {
	
	public static void main(String[] args) throws Exception {
		
		sumjob sj=new sumjob();
		sj.start();
		sj.join();
		Thread.sleep(500);
		avgjob aj=new avgjob();
		aj.start();
		
	}

}
