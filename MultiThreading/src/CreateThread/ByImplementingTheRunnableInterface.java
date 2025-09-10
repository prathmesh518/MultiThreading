package CreateThread;

public class ByImplementingTheRunnableInterface {
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hello");
		}
		
	}
}
