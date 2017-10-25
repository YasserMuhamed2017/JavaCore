	package mainpackage;

import java.util.StringJoiner;

public class Classes {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String [] names = {"yasser" , "salem" , "mohamed" , "asmaa" };
	
	//String allNames = ""; //this variable is Immutable Object
	
	StringJoiner stringJoiner = new StringJoiner(" , "," { " , " } ")  ; // mutable
	stringJoiner.setEmptyValue("no value");
	for (String name : names) {
		stringJoiner.add(name);
	}
	System.out.println(stringJoiner);
		}
	
	}
