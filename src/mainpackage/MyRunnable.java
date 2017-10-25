	package mainpackage;
	
	public class MyRunnable implements Runnable{
		boolean isRunning = true ;
		String name ;
		public MyRunnable(String name) {
			this.name = name;
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int count = 0;
			while (isRunning) {
				System.out.println(this.name+count);
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