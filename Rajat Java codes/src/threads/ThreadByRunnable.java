package threads;

public class ThreadByRunnable implements Runnable{ // here we are implementing runnable to create a thread
	Thread t; //Thread is an inbuilt class whose variable we have taken as t"
	String name;
	int time;
	public ThreadByRunnable(String name,int time)
	{
		t=new Thread(this); //this is used because we are telling the thread that we are using this class
		this.name=name;
		this.time=time;
		t.start();
	}

	@Override
	public void run() {  // to implement the runnable , a class only need to implement one single method called  run(), which is declared as public void run();
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			
			t.setPriority(1);  //setting priority as 1
			System.out.println("Priority = "+t.getPriority()); //Printing the priority i.e 1 here
			System.out.println(name/*name is the Stringname*/+" = " +i+"  Current thread running is"+t.currentThread()/*Current Thread is*/ );
			try {
				Thread.sleep(time); //wite Thread.sleep(time) then click on this it automatically inserts into try cache block
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
