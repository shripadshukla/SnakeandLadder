package snakeandladder;

public class SnakeAndLadder {

	public static void main(String []args) {

		int dicepos=0;
		
		for( dicepos=1; dicepos<=100; dicepos++) {
		
		int dice = (int) Math.floor(Math.random() * 10) % 7;

		switch (dice) {
		
		case 1:
			System.out.println("Ladder");
			dicepos = dicepos + dice;
			System.out.println(dicepos);
			
			break;
			
		case 2:
			System.out.println("Ladder");
			dicepos = dicepos + dice;
			System.out.println(dicepos);
			
			break;
			
		case 3:
			System.out.println("Ladder");
			dicepos = dicepos + dice;
			System.out.println(dicepos);
		    
			break;
		    
		case 4:
			System.out.println("Snake");
			dicepos = dicepos - dice;
			System.out.println(dicepos);
		
			break;
			
		case 5:
			System.out.println("Snake");
			dicepos = dicepos - dice;
			System.out.println(dicepos);
			
			break;
			
		case 6:
			System.out.println("Snake");
			dicepos = dicepos - dice;
			System.out.println(dicepos);
			
			break;
			
		default:
			System.out.println("No Moves");
			dicepos = dicepos;
			System.out.println(dicepos);
			
			break;
		}
		
		//dicepos = dicepos+dice;
		
		}
	}

}
