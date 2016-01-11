import java.util.*;

public class Hand {

//instance variables
private static final List<Card> handDeck = new ArrayList<Card>();
private int score;

//Constructor
public Hand() {
  score = 0;
}

public void addCard(Card card) {
  handDeck.add(card);
}

public int getScore() {
    return score;
  }

public Card getCard() {
    Card card = handDeck.get(0);
    handDeck.remove(0);
    score = score + card.getValue();
    return card;
  }
public void clearScore(){
  score = 0;
  handDeck.clear();

}
public int getSize(){
  int size = handDeck.size();
  return size;

}

}
