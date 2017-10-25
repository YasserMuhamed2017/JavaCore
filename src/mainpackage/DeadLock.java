	package mainpackage;
	
	public class DeadLock {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			final String passenger1 = "YASSER";
			final String passenger2 = "SALEM";
			
			Thread bus1 = new Thread() {

				@Override
				public void run() {

					synchronized (passenger1) {
						System.out.println("bus 1 is locked p1");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {}
					}
					synchronized (passenger2) {
						System.out.println("bus 1 is locked p2");
					}
				}
			};
			Thread bus2 = new Thread() {

				@Override
				public void run() {

					synchronized (passenger2) {
						System.out.println("bus 1 is locked p2");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {}
					}
					synchronized (passenger1) {
						System.out.println("bus 1 is locked p1");
					}
				}
			};
			bus1.start();
		    bus2.start();
	
		}
	
	}
