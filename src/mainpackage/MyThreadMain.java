	package mainpackage;
	
	public class MyThreadMain {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	
			MyThread myThread = new MyThread("Thread1:");
			// we use join() method as placeholder of synchronized
			myThread.start();
			myThread.join();
			
			MyThread myThreads = new MyThread("Thread2:");
			
			 /*
			  *  this method mean that thread class understand automatically I need to run the method 
			  *  whose name is run();
			  */
			
			myThreads.start();
			System.out.println("Thread is running");
			Thread.sleep(6000);
			myThread.isRunning = false;
			
			/*
			 * MyRunnable myRunnable = new MyRunnable("Runnable:");
			 *Start the thread
			 *Thread thread = new Thread(myRunnable);
			 *thread.start();
			 */
			
		   
		}
	
	}
