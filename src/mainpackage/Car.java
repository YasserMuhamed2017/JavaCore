	
package mainpackage;
	
	public  class Car {
		String type;
		int model;
		double price;
		double milesDrive;
		static String owner;
		Owners owners;
		 Car( String type,int model,double price,double milesDrive ){
		this.type = type;
		this.model = model;
		this.price = price;
		this.milesDrive = milesDrive;
		
			System.out.println("Class is Created");
			// Aggregation Concept
			owners = new Owners();
			owners.firstName = "YASSER";
		}
		Car(){
			System.out.println("Constructor 2 is Created");
		}
		
		double getPrice() {
			double newPrice = price - ( milesDrive * 100);
			return newPrice;
		}
	
	}
