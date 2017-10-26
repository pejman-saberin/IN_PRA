package question1;

import java.util.ArrayList;

public class Deck  <T extends Card>{ 		 
		private ArrayList<T> cards; // all cards, dealt or not
		private int dealtlndex = 0; // marks first undealt card		
		public void setDeckOfCards(ArrayList<T> deckOfCards)
		{
			
		}
		public void shuffle(){}
		public int remainingCards(){
			return cards.size() - dealtlndex;
		}
		public  Object dealHand(int number) {return null; }
		public T dealCard() {
			return null;  }
		public abstract class Card {
			private boolean available = true;
		}
		/* number or face that's on card - a number 2 through 10, or 11
		 * for Jack, 12 for Queen, 13 for King, or 1 for Ace */
		 protected int faceValue;
		 protected Suit suit;
		
		 public void Card(int c, Suit s) {
		 faceValue = c;
		 suit = s;
		 }
		
		 
 
}
