class A extends Thread
{
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			if(i==2)
			yield();
			System.out.println("\nFrom A thread" +i);
		}
	System.out.println("\nThread A end\n");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			if(i==3)
			stop();
			System.out.println("\nFrom B thread" +i);
		}
	System.out.println("\nThread B end\n");
	}
}

class C extends Thread
{	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				if(i==4)
				sleep(4000);
			}
			catch(Exception e)
			{}
		System.out.println("\n From C Thread" +i);
		}
	System.out.println("\n Thread C End");
	}
}
			
class ThreadDemo
{
	public static void main(String ar[])throws Exception
	{
		System.out.println("\n Main thread Start\n");

		for(int i=0;i<5;i++)
		{
			System.out.println("\nFrom Main Thread\n" +i);
		}
	
	A a1=new A();
		B b1=new B();
		C c1=new C();

		a1.start();
		b1.start();
		c1.start();
	System.out.println("\n C thread is alive" +c1.isAlive());
		a1.join();
		b1.join();
		c1.join();
	System.out.println("\n A thread is alive" +a1.isAlive());
	System.out.println("\n B thread is alive" +b1.isAlive());
	System.out.println("\n Main Thread End\n");
	}
}