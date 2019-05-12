package classEx1;

public class triggerjob {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++){
			
			System.out.println("in main  11  >>"+i);
			
		}
		
		//System.out.println("in main >>"+Thread.currentThread().getName());   //print thread name
		job jb=new job();
		jb.setName("AAAA");
		//jb.run();    //treated as a ordinary method 
		jb.start();
		Thread.sleep(5000);     //  sleep main mwthod
		//job jb1=new job();       //we can call many times
		//jb1.start();
		
		for(int i=20;i<30;i++){
			
			System.out.println("in main 22 >>"+i);
		}
		
	}

}
