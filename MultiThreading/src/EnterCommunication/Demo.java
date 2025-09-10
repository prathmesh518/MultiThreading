package EnterCommunication;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		MyThread m = new MyThread();
		m.start();
		
		System.out.println("main thread is waiting");
		synchronized (m) {
		m.wait();
		System.out.println(m.total);
        System.out.println("main end");
		
		}
		
		
	}
}
