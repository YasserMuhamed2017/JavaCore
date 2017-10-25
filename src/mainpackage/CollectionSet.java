	package mainpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionSet {
	
		public static void main(String[] args) {
			

			// HashSet element can't be duplicate and unordered data
			//TreeSet has ordering data
			TreeSet<String> hashSet = new TreeSet<>();
			
			hashSet.add("Yasser");
			hashSet.add("Salem1");
			hashSet.add("Yasser");
			hashSet.add("Marwa");
			
			Iterator<String> iterator = hashSet.iterator(); 
			while (iterator.hasNext()) {
				System.out.println(iterator.next());	
			}
			System.out.println();
			
				
			
			
			
			
			
			
			
	
		}
	
	}
