	package mainpackage;
	
	public class Casting {
	public static void main(String [] args) {
		CarTruck.owner = "smith";
		CarTruck carTruck = new CarTruck();
	    carTruck.setHasTruck ( true );
	    carTruck.milesDrive = 100;
	    carTruck.model = 2016;
	    carTruck.type  = "GSM";
	    carTruck.price = 555;
	   Car myCar = (Car)carTruck;
	   Car car = new Car();
	   System.out.println(myCar.getPrice());
	 
	}
	}
