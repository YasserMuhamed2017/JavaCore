	package mainpackage;
	
	//Generic Class
	  public class Generic <X> {
		 
		public static void main(String[] args) {
			
			String [] x= { "yasser" , "salem ", "Mahmoud"};
			Integer [] y= { 1 ,2,3,5,44,5,56,546,48};
			Double [] z= {3.4,56.65,2.03,1.8};
			print(x);
			print(y);
			print(z);
		}
		//Generic Method
          static <X> void print(X [] array) {
			for (X s : array) {
				System.out.println(s);
			}
		}
     }
