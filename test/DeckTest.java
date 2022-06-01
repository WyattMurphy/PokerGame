import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testSize() {
		Deck d = new Deck();
		int expected = 51;
		int actual = d.getSize();
		assertEquals(expected, actual);
	}
	@Test
	void testGetTop() {
		Deck d = new Deck();
		int expected = d.cards.get(51);
		int actual = d.getTop();
		assertEquals(expected, actual);
	}
	@Test
	void testGetTopN() {
		Deck d = new Deck();
		Random ran = new Random();
		int n = ran.nextInt(52);
		for(int i = 0; i < n; i ++) {
			d.getTop();
		}
		int expected = d.cards.get(51-n);
		int actual = d.getTop();
		assertEquals(expected, actual);
	}
	@Test
	void testShuffle() {
		// FIXME potential false negative given random element of shuffle method
		Deck d = new Deck();
		int expected = d.cards.get(51);
		d.shuffle();
		int actual = d.cards.get(51);
		assertNotEquals(expected, actual);
	}

}
