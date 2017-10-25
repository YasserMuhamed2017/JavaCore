	package mainpackage;
	
	public class OperationImplement2 implements Operations{

		int x = 10 ;
		int y = 15 ;
		@Override
		public int sum(int x, int y) {
			// TODO Auto-generated method stub
			return x + y + 10;
		}

		@Override
		public int getX() {
			// TODO Auto-generated method stub
			return x;
		}
	
	}
