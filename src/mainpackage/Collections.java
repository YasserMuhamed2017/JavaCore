		package mainpackage;
	
	import java.util.ArrayList;
	
	public class Collections {
		
			public static void main(String[] args) {
				// ArrayList is used for retrieve data
				// TODO Auto-generated method stub
				ArrayList <String> arrayList = new ArrayList<>();
				arrayList.add("developer");
				arrayList.add("designer");
				arrayList.add("entrepreneur");
				System.out.println(arrayList.get(0));
				for (String s : arrayList) {
					System.out.println(s);
				}
				ArrayList <Employee> arrayOfObjects = new ArrayList<>();
				arrayOfObjects.add(new Employee("Ahmed" , 27));
				arrayOfObjects.add(new Employee("Ali" , 65));
				arrayOfObjects.add(new Employee("Yasser" , 67));
				for (Employee employee : arrayOfObjects) {
					System.out.println(employee.name);
					
					
				}
			}
		static class Employee{
			String name;
			int age;
			Employee(String name , int age){
				this.name = name ;
				this.age = age ;
			}
		}
		}
