	package mainpackage;
	
	public class CarTruck extends Car{
	
		private boolean hasTruck;
		void setHasTruck(boolean hasTruck) {
			this.hasTruck = hasTruck;
		}
		
		CarTruck( ){
			super("BMW" ,2015 , 10000 ,5);
			System.out.println("Constructor 3 is Created");
		}
		@Override
		double getPrice() {
			//different content
			double newPrice = price - ( milesDrive * 50);
			return newPrice;
		}
		
		void getOwner() {
			System.out.println(Car.owner);
			System.out.println(super.getPrice());
			
		}
		}
		