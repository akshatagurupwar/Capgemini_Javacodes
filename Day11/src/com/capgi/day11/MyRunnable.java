package com.capgi.day11;

class MyRunnableThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			// currentThread() --it will give the currently running thread
			// ALl the props using methods
			
				System.out.println("Thread class" + i + " " + Thread.currentThread().getName());
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		// this.currentThread.sleep(1000);
	}
	
}


public class MyRunnable {
	
	public static void main(String args[])
	{
		//creating the object of Runnable Interface implemnted class
		MyRunnableThread thread=new MyRunnableThread();
		//Create Object of Thread class and giving runnable interface Object
		//Thread Constructor pass the runnable references 
		Thread T1=new Thread(thread);
		T1.setName("T1");
		T1.start();
		//T1.join();
		
		Thread T2=new Thread(thread);
		T2.setName("T2");
		T2.start();
		
		
		
	}
}