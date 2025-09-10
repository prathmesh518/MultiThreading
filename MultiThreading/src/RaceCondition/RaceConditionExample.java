package RaceCondition;

public class RaceConditionExample {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("final count " + c.count);
	}
}
