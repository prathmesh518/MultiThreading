package MultiThreading;

public class ExampleOfMultiThreading extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<=20; i++) {
			System.out.println("thread running " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		ExampleOfMultiThreading ex1 = new ExampleOfMultiThreading();
		ExampleOfMultiThreading ex2 = new ExampleOfMultiThreading();
		
		ex1.start();
		ex2.start();
		
	}
}
