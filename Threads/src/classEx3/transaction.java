package classEx3;

public class transaction extends Thread{
	
	static int balance=2000;
	@Override
	public void run() {
		
		for(int i=0; i<10;i++){
			
			withdraw(150);
		                      }
		
			          }
	private static synchronized void withdraw(int amt) {
		System.out.println("trying to widhdraw >>"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		if(balance>200){
			
			balance=balance-amt;
		}else{
			System.out.println("plz come back after depositing money in acc");
		}
		
		System.out.println("Balance remaining in acc is" +balance);
		
	}
                                      }
