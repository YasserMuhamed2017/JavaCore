	package mainpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class UserLoginWeekPassword {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Login> userLogin = new ArrayList<Login>();
			userLogin.add(new Login("YASSER" , "123456"));
			userLogin.add(new Login("SALEM" , "6546466"));
			userLogin.add(new Login("LAYA" , "fdgfgh"));
			userLogin.add(new Login("AZA" , "23"));
			
			Predicate<Login> predicate = (p) -> p.isWeak() == true ;
		
			
			// Using Lambda
			System.out.println("weak passwords ");
			
			userLogin.forEach( (LoginInfo) -> {
				if (predicate.test(LoginInfo)) {
				System.out.println(LoginInfo.username);
				System.out.println(LoginInfo.password);
				}
			});
			
			/*
			 * 	System.out.println(" for each");
			 *for each
			 *for (Login login : userLogin) {
				System.out.println("Username: " + login.username);
				System.out.println("Pasword: " + login.password);
			}
			// Iterator
			System.out.println("Iterator");
			Iterator<Login> iterator = userLogin.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().username);
				System.out.println(iterator.next().password);
			} 
			 */
			
		
	
		}
	
	
	}
