package SynchronizedBlockWithClassLock;

public class Logger {
static void log(String message) {
	synchronized (Logger.class) {
		System.out.println(Thread.currentThread().getName()+" logging "+ message);
	}
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
	

