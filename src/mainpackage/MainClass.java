	package mainpackage;
	
	public class MainClass {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		//	RunnableClass runnableClass = new RunnableClass();
			/* Lambda Expression */
			Runnable runnable = () -> { /*Brackets for Multi-lines */
				System.out.println("Thread is Working");
			};
			Thread thread = new Thread(runnable);
			thread.start();
	
		}
	
	}
