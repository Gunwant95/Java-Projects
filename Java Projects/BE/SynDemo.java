class A
{
	int count;
	synchronized void display()
	{
		count++;
		System.out.println("\n This is java");
		
		try
		{
			Thread.sleep(1000);
		}
		
		catch(Exception e){}
	System.out.println(count);
	}
}

class SyncDemo implements Runnable
{
	Thread t;
	A t1;
	SyncDemo(A a)
	{
		t=new Thread(this);
		t.start();
		t1=a;
	}

	public void run()
	{
		t1.display();
	}
}

class SynDemo
{
	public static void main(String ar[])
	{
		A a1=new A();
		SyncDemo s1=new SyncDemo(a1);
		SyncDemo s2=new SyncDemo(a1);
	}
}