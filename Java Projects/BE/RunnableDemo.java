class A implements Runnable
{
	Thread t;
	A()
	{
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("\n from thread A" +i);
		}
	System.out.println("A end");
	}
}

class RunnableDemo
{
	public static void main(String ar[])
	{
		System.out.println("\n Main thread start");
		A a1=new A();
		for(int i=1;i<5;i++)
		{
			System.out.println("\n From main thread" +i);
		}
	System.out.println("\n Main End");
	}
}