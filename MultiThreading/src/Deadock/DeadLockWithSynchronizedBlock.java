package Deadock;

public class DeadLockWithSynchronizedBlock {

	public static void main(String[] args) {
		Resource r1 = new Resource("Resource 1");
		Resource r2 = new Resource("Resource 2");
		
		
		Thread t1 = new Thread(()->{
			synchronized (r1) {
				System.out.println("Thread 1 locked "+ r1.name);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (r2) {
					System.out.println("Thread 1 loacked " + r2.name);
				}
			}
		});
		
		
		Thread t2 = new Thread(()->{
			synchronized (r2) {
				System.out.println("Thread 2 locked "+ r2.name);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (r1) {
					System.out.println("Thread 2 loacked " + r1.name);
				}
			}
		});
		
		t1.start();
		t2.start();
		
		
	}
	
}
