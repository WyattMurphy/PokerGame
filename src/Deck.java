import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class representing a deck of 52 playing cards 
 * Deck class had <cards> and <size> 
 * cards is an integer array treated as a stack
 * size represents the theoretical number of cards left in the deck by serving as a reference to the index indicating the top of the stack
 * 
 * @author dustymcbender
 *
 */
public class Deck {
	protected List<Integer> cards = new ArrayList<Integer>();
	protected int size;
	
	Deck(){
		this.size = 51;
		for (int i = 1; i <= 52; i ++) {
			this.cards.add(i);
		}
		Collections.shuffle(cards);
	}
	
	// getters
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Gets the element at the top of the stack (position size) and decrements size showing the card has been taken from the top of the deck
	 * @return int element at position size
	 */
	public int getTop() {
		int cur = cards.get(size);
		this.size -= 1;
		return cur;
	}
	
	/**
	 * shuffle sets the size of the deck back to its starting value of 51 representing a full deck
	 * shuffle also randomizes the order of the decks elements
	 */
	public void shuffle() {
		this.size = 51;
		Collections.shuffle(cards);
	}
	
}
