package Volatile;

public class VolatileExample extends Thread{

	volatile boolean running = true;
	
	@Override
	public void run() {
		while (running) {
			
		}
	
		System.out.println("thread stopped...");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		VolatileExample obj = new VolatileExample();
		
		obj.start();
		
		Thread.sleep(1000);
		
		obj.running=false;
		
		System.out.println("main thread updated running to false");
	}
}
