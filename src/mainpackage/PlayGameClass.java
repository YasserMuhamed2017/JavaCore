	package mainpackage;
	
	public class PlayGameClass {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			//Lambda Expression
			PlayGame playGame = (x,y) -> {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("game is on");
			};
			playGame.play(4,5);
			// Without Lambda Expression is used only in Functional interface
			MyPlayGameClass myPlayGameClass = new MyPlayGameClass();
			myPlayGameClass.play(4,5);
		}
		static class MyPlayGameClass implements PlayGame{

			@Override
			public void play(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println("Game is on ");
				
			}
			
		}
	
	}
