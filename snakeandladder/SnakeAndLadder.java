package snakeandladder;

public class SnakeAndLadder {

	public static void main(String []args) {

		double dice = Math.floor(Math.random() * 10) % 7;

		System.out.println("Player roll a dice");

		System.out.println("Dice number is : " + dice);
	}

}
