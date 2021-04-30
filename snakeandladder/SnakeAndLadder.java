package snakeandladder;

public class SnakeAndLadder {

	public static void main(String []args) {


		int dicepos1=0;
		int dicepos2=0;
		int start=0;
		int lastpos=100;
		int count1=0;
		int count2=0;
		
		while(dicepos1 < lastpos && dicepos2 < lastpos) {
			
			
			int dice1 = (int) Math.floor(Math.random() * 10) % 7;    //1 or 2 or 3 or 4 or 5 or 6
			
			int option = (int) Math.floor(Math.random() * 10) % 3;   //1 or 2
			
			switch (option) {
			
			case 0:
				
				System.out.println("No Moves");
				dicepos1=dicepos1;                         
				System.out.println("player1 dice position: " +dicepos1);
				break;
			
			case 1:
				
				System.out.println("Ladder");
				dicepos1=dicepos1+dice1;                         
				System.out.println("player1 dice position: " +dicepos1);
				break;
				
			case 2:
				
				System.out.println("Snake");
				dicepos1=dicepos1-dice1;
				System.out.println("player1 dice position: " +dicepos1);
				
				break;
			
			}
			
			if(dicepos1 == 100) {
				break;
			}

			else if(dicepos1 > 100) {
				dicepos1 = dicepos1-dice1;
				System.out.println("Invalid move by player1");
			}
			else if(dicepos1 < 0) {
				dicepos1 = start;
			}
			
			else {
				System.out.println("new position: "+dicepos1);
			}
			
			
			int dice2 = (int) Math.floor(Math.random() * 10) % 7;    //1 or 2 or 3 or 4 or 5 or 6
			
			int option2 = (int) Math.floor(Math.random() * 10) % 3; 
			
			switch(option2) {
			
			case 0:
				
				System.out.println("No moves");
				dicepos2=dicepos2;
				break;
				
			case 1:
				
				System.out.println("Ladder");
				dicepos2=dicepos2+dice2;
				System.out.println("player2 dice position: "+dicepos2);
				break;
				
			case 2:
				
				System.out.println("Snake");
				dicepos2=dicepos2-dice2;
				System.out.println("player2 dice position: "+dicepos2);
				break;
				
			}
				
			if(dicepos2 == 100) {
				break;
				
			}
			
			else if(dicepos2 > 100) {
				dicepos2 = dicepos2-dice2;
				System.out.println("Invalid move by player2");
			}
			else if(dicepos2 < 0) {
				dicepos2 = start;
			}
			else {
				System.out.println("new position: "+dicepos2);
			}
			
		}	
		if (dicepos1==100) {
			System.out.println("Player1 Won");
		}else {
			System.out.println("Player2 Won");
		}
	}

}
