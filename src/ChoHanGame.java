import javax.swing.JOptionPane;

public class ChoHanGame {

	public static void main(String[] args) {
		String player1 = "BOB";
		String player2 = "James";
		int points1 = 0;
		int points2 = 0;
		
		for (int i = 0; i <=5; i++) {
			DiceRoll dice1 = new DiceRoll('n');
			int d1 = dice1.getDiceRoll1();
			int d2 = dice1.getDiceRoll2();
			
			String guess1 = JOptionPane.showInputDialog("Cho or Han: ");
			System.out.println(guess1);
			String guess2 = JOptionPane.showInputDialog("Cho or Han: ");
			System.out.println(guess2);
			
			Announcement announce = new Announcement (player1, guess1, player2, guess2, d1, d2, points1, points2);
			points1 = announce.getPoints(player1);
			points2 = announce.getPoints(player2);
			System.out.println("The Dices are: " + d1 + " and " + d2 + ", therefore it is " + announce.getchohan() 
				+ ".\n And the winner is " + announce.getWinner());
		}
		String winner = "";
		int winningPoints = 0;
		
		if (points1 > points2) {
			winner = player1;
			winningPoints = points1;
		}else if (points1 < points2) {
			winner = player2;
			winningPoints = points2;
		}else {
			winner = "a tie";
			winningPoints = points1;
		}
		
		System.out.println("The Winner of the five rounds is " + winner + " with the " + winningPoints + " points.");
		
	}
	//String n1, String p1, String n2, String p2, int d1, int d2

}
