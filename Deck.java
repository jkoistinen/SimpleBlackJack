import java.util.*;

public class Deck {
  // instance variables
  private static final List<Card> playDeck = new ArrayList<Card>();

  /**
   * Constructor for objects of class Deck.
   */
  public Deck() {
    for (Card.Suit s : Card.Suit.values()) {
      for (Card.Rank r : Card.Rank.values()) {
        playDeck.add(new Card(r, s));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(playDeck);
  }

  public Card getCard() throws IndexOutOfBoundsException {
    if (playDeck.size() < 1 ) {
      throw new IndexOutOfBoundsException("Om du eller någon närstående har problem med sitt spelande kan du kontakta Stödlinjen för spelare och anhöriga på telefonnummer 020 81 91 00 eller via www.stodlinjen.se. ");
    }
    Card card = playDeck.get(0);
    playDeck.remove(0);
    return card;
  }
}
