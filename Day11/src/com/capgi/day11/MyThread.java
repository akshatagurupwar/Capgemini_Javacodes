package com.capgi.day11;

class TestThread extends Thread {
	// MUltiple thread can can and execute this code
	// T1 and T2 can execute this code
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			// currentThread() --it will give the currently running thread
			// ALl the props using methods
			
				System.out.println("Thread class" + i + " " + currentThread().getName());
				try {
					currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		// this.currentThread.sleep(1000);
		
	}
	
	

}

public class MyThread {

	public static void main(String args[]) {
		TestThread T1 = new TestThread();
		// start method is use to start the thread
		// and internally call the run method
		// setName is used to set the name of thread
		T1.setPriority(10);
		T1.setName("T1");
		
		T1.start();
        
		TestThread T2 = new TestThread();
		T2.setName("T2");
		
		T2.start();
		 
	}

}
