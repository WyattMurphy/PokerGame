import java.util.ArrayList;
import java.util.List;

/**
 * abstract class with some of the basic player actions
 * 
 * @author dustymcbender
 *
 */
public abstract class Player {
	String name;
	boolean playing;
	List<Integer> myCards = new ArrayList<Integer>();
	int seat;
	boolean big;
	boolean small;
	double value;

	Player(int cash, String name) {
		this.value = cash;
		this.name = name;
	}

// getters & setters
	// name
	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}

	// playing
	public boolean getPlaying() {
		return this.playing;
	}

	public void setPlaying(boolean p) {
		this.playing = p;
	}

	// value
	public double getVal() {
		return this.value;
	}

	public void setVal(double d) {
		this.value = d;
	}

	// big blind
	public boolean getBig() {
		return this.big;
	}

	public void setBig(boolean b) {
		this.big = b;
	}

	// small blind
	public boolean getSmall() {
		return this.small;
	}

	public void setSmall(boolean s) {
		this.small = s;
	}

	// seat position
	public int getSeat() {
		return this.seat;
	}

	public void setSeat(int s) {
		this.seat = s;
	}

	// cards
	public List<Integer> getCards() {
		return this.myCards;
	}

	public void setCards(int a, int b) {
		this.myCards.add(a);
		this.myCards.add(b);
	}

	// game actions
	/**
	 * 
	 * @param b boolean value of players choice to play
	 */
	public void checkFold(boolean b) {
		if (!b) {
			setPlaying(b);
			resetHand();
		}
	}

	/**
	 * Call method allows the player to choose if they want to call an oponents bet,
	 * then appropriately deducts the call amount from the players value or folds
	 * the players hand
	 * 
	 * @param c boolean operator referencing the players choice to call
	 * @param b double value representing the call amount
	 * @return boolean of players choice to call
	 */
	public boolean Call(boolean c, double b) {
		if (c) {
			this.value -= b;
			return c;
		}
		checkFold(c);
		return c;
	}


	// auxiliary methods
	protected void resetHand() {
		// set myCards back to empty list
		this.myCards = new ArrayList<Integer>();
	}

	public String toString() {
		return "Name: " + name + " : Value: $" + value + " : Seat Position: " + seat;
	}

}
