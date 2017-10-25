	package mainpackage;

import java.util.Scanner;

public class Exceptions {
	
		private static Scanner scanner;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			scanner = new Scanner(System.in);
			try {
				int x= scanner.nextInt();
				System.out.println(x);
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}finally {
				
			}
			
		}
	
	}
