package ClassLock;

public class ClassLockExample {

	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i<=1000;i++) {
				SharedCounter.increment();
			}
		});
		

		Thread t2 = new Thread(()->{
			for(int i = 0; i<=1000;i++) {
				SharedCounter.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("final count "+ SharedCounter.count);
	}
}
