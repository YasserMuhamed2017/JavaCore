	package mainpackage;
	
	import java.util.HashMap;
	import java.util.Map;
	
	public class CollectionHash {
		
			public static void main(String[] args) {
				
				HashMap<Integer , String> map = new HashMap<Integer , String>();
				
				map.put( 1 , "YASSER");
				map.put(2, "SALEM");
				map.put(3, "Ahmed");
			//  System.out.println(map.get(1));
		
				for (Map.Entry mapEntry : map.entrySet()) {
					System.out.println("Key: " + mapEntry.getKey() + " ,value " + mapEntry.getValue());
				}
				map.put(1, "Rana");
				System.out.println(map.get(1));
				map.remove(1);
				System.out.println(map.get(1));
			}
		
		}