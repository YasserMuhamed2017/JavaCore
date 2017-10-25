	
package mainpackage;
	
	public class carMain {
	
		public static void main (String [] args) {
		     Car.owner = "smith";
			  
			Car car1 = new Car("BMW" ,2015 , 10000 ,5);
		  
			System.out.println(car1.owner);
			
			
		    Car car2 = new Car();
			car2.type= "Adiddas";
			car2.model = 2016;
			car2.price = 164664;
			car2.milesDrive = 51;
			System.out.println(car2.owner);
		
			
		}
	}
