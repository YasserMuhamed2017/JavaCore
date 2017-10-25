	package mainpackage;
	
	public class CarTruckMain {
	
		public static void main(String [] args) {
			CarTruck.owner = "smith";
			CarTruck carTruck = new CarTruck();
		    carTruck.setHasTruck ( true );
		    carTruck.milesDrive = 100;
		    carTruck.model = 2016;
		    carTruck.type  = "GSM";
		    carTruck.price = 555;
		    System.out.println(carTruck.getPrice());
		    carTruck.getOwner();
		    InnerClass innerClass = new InnerClass();
		    InnerClass.Animal animal = innerClass.new Animal();
		    InnerClass.Animal anim = innerClass.new Animal();
		    
		    
		}
	}
