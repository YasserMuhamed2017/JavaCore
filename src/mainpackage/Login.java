	package mainpackage;
	
	public class Login {
	
		String username;
		String password;
		
		public Login(String username , String password) {
			this.username = username ;
			this.password = password ;
		}
		Boolean isWeak() {
			if (password.length() <= 3) 
				return true ;
			else
				return false ;
			
		}
	
	}
