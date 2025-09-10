package EnterCommunication;

public class MyThread extends Thread{

	int total = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("My thread is executing");
			for(int i = 0; i<=100; i++) {
				total=total+i;
			}
			this.notify();
			System.out.println("Mythread1 End");
		}
	}
	
}
