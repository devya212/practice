package multithreading;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread1..."+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class MultiThreadingDemo1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Tread..."+i);
		}

	}

}
