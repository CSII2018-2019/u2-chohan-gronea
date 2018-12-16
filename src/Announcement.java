
public class Announcement{
	
	String guess1;
	String name1;
	int point1;
	String guess2;
	String name2;
	int point2;
	String chohan;
	String winner;
	int winningPoints;

	public Announcement(String n1, String p1, String n2, String p2, int d1, int d2, int points1, int points2) {
		System.out.println(p1);
		System.out.println(p2);
		setGuess1(n1, p1, points1);
		setGuess2(n2, p2, points2);
		setChohan(d1, d2);
		setWinner();
	}

	//Player Guess
	private void setGuess1(String n, String p, int points) {
		name1 = n;
		point1 = points;
		if (p == "Cho" || p =="cho") {
			guess1 = "Cho";
		}else if (p == "Han" || p =="han") {
			guess1 = "Han";
		}else {
			System.out.println(" {" + guess1 + "} that is not possible. automatic lose of round");
			guess1 = "z";
		}
	}
	private void setGuess2(String n, String p, int points) {
		name2 = n;
		point2 = points;
		if (p == "Cho" || p =="cho") {
			guess2 = "Cho";
		}else if (p == "Han" || p =="han") {
			guess2 = "Han";
		}else {
			System.out.println(" {" + guess1 + "} that is not possible. automatic lose of round");
			guess2 = "z";
		}
	}
	private void setChohan(int d1, int d2) {
		int total = d1 + d2;
		if (total % 2 == 0) {
			chohan = "Cho";
		}else {
			chohan = "Han";
		}
	}
	public String getchohan() {
		return chohan;
	}
	
	private void setWinner() {
		if (guess1 == chohan && guess2 != chohan) {
			winner = name1;
			point1 ++;
		}else if (guess1 != chohan && guess2 == chohan) {
			winner = name2;
			point2++;
		}else {
			winner = "None";
		}
	}
	public String getWinner() {
		return winner;
	}
		
	public int getPoints(String n) {
		if (n == name1) {
			return point1;
		}else{
			return point2;
		}
	}
	public String toString() {
		return "The Winner is " + winner + ".";
	}
}
