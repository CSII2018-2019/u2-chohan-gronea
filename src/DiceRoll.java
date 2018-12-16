
public class DiceRoll{
	int diceRoll1;
	int diceRoll2;
	
	public DiceRoll(char a) {
		if (a == 'y'||a == 'Y') {
			setLoaded1();
			setLoaded2();
		}else {
			setDiceRoll1();
			setDiceRoll2();
		}
	}
	//Dice - Normal
	private void setDiceRoll2() {
		diceRoll1 = (int) (Math.random() * 6) + 1;
	}
	public int getDiceRoll2() {
		return diceRoll2;
	}
	
	private void setDiceRoll1() {
		diceRoll1 = (int) (Math.random() * 6) + 1;
		
	}
	public int getDiceRoll1() {
		return diceRoll1;
	}
	
	//Dice - Loaded for Even
	private void setLoaded1() {
		diceRoll1 = (int) (Math.random() * 6) + 1;
	}
	public int getLoaded1() {
		return diceRoll1;
	}
	private void setLoaded2() {
		int possNum = (int) (Math.random() * 6) + 1;
		if (diceRoll1 % 2 == 0 && possNum % 2 == 0) {
			diceRoll2 = possNum;
		}else if (diceRoll1 % 2 != 0 && possNum % 2 == 0) {
			diceRoll2 = possNum + 1;
		}else if (diceRoll1 == 0 || possNum % 2 != 0) {
			diceRoll2 = possNum + 1;
		}
	}
	public int getLoaded2() {
		return diceRoll2;
	}
	public String toString() {
		return "Dice #1: " + diceRoll1 + "\nDice #2: " + diceRoll2;
	}
}
