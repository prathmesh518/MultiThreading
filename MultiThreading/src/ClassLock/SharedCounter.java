package ClassLock;

public class SharedCounter {

	static int count=0;
	
	public static synchronized void increment() {
		
		count++;
		
	}
	
	
}
