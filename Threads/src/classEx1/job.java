package classEx1;

public class job extends Thread {
	@Override
	public void run() {
		//System.out.println("in job >>"+Thread.currentThread().getName());  // Print thread name
		
		for(int i=10;i<20; i++){
			System.out.println("in job 11>>"+i);
		}
	}

}
