package CreateThread;

public class ByExtendingTheThreadClass {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hello");
		}
	}
}
