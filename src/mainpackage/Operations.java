	package mainpackage;
	
	public interface Operations {
	
		public int sum(int x, int y);
		 int getX();
		// By using default make me implement this method in interface 
		default void display() {
			System.out.println("x: " + getX());
		}
		static void disp() {
			System.out.println("hello from static ");
		}
	}