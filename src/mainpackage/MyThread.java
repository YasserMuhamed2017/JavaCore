	package mainpackage;
	
	public class MyThread extends Thread {
		boolean isRunning = true ;
		static String name ;
		public MyThread(String name) {
			this.name = name;
			
		}
		@Override
		public void run() {
			display();
			
			
			
		}
		/*
		 *  static is used here for not to be shared in all classes
		 *  and synchronized is used for that one person or one class 
		 *  is access to it
		 */
		/**
		 * we can use synchronized for a block of code
		 * synchronized(name) {
		 *		start your instructions
	     * }
		 */
		
		  void display() { // synchronized for one method

			// TODO Auto-generated method stub
			int count = 0;
			while (count < 10) {
				System.out.println(name+count);
				count++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		
	}
