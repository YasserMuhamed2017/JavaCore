	package mainpackage;
	
	public class OperationImplement1 implements Operations{

		int x = 10 ;
		int y = 15 ;
		@Override
		public int sum(int x, int y) {
			// TODO Auto-generated method stub
			return x+y;
		}

		@Override
		public int getX() {
			// TODO Auto-generated method stub
			return x;
		}
		public static void main(String [] args) {
			Operations.disp();
			System.out.println(new OperationImplement1().getX());
			
			new OperationImplement1().display();
		}
	
	}
