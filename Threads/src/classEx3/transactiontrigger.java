package classEx3;

public class transactiontrigger {
	
	public static void main(String[] args) {
		transaction tx=new transaction();
		tx.setName("Amazon");
		tx.start();
		transaction tx1=new transaction();
		tx1.setName("flipkart");
		tx1.start();
	}

}
