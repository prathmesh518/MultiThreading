package SynchronizedBlockWithClassLock;

public class ClassLockExample {

	public static void main(String[] args) {
		Runnable task = ()-> Logger.log("System Event");
		
		Thread t1 = new Thread(task, "Thread A");
		Thread t2 = new Thread(task, "Thread B");
		
		t1.start();
		t2.start();
	}
}
