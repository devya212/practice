package multithreading;

class Thread2 implements Runnable
{

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread2..."+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MultiThreadingDemo2 {

	public static void main(String[] args) {
		Thread2 t1=new Thread2();
		Thread th=new Thread(t1);
		th.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Tread..."+i);
		}

	}

}
