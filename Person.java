import java.util.*;

public class Person implements Comparable<Person> {
  // instance variables
  private int gameswon;
  private int score; //reset every new round

  public int hitlimit;
  public String name;

  private static final List<Card> handDeck = new ArrayList<Card>();

  /**
  * Constructor for objects of class Person.
  */
  public Person() {
    // initialise instance variables
    gameswon = 0;
    score = 0;
    hitlimit = 15;
  }

  public void clearScore() {
    score = 0;
  }

  public void addScore(int givenscore) {
    score = score + givenscore;
  }

  public int getScore() {
    // for (int i = 0; i < handDeck.size(); i++) {
    //     //System.out.println( handDeck.get(i).getValue() );
  	// 		score = score + handDeck.get(i).getValue();
  	// 	}
    return score;
  }

  public void incrementGamesWon() {
    gameswon = gameswon + 1;
  }

  public int getGamesWon() {
    return gameswon;
  }

  public void addCard(Card card) {
    handDeck.add(card);
    score = score + card.getValue();
  }

  public Card getCard() {
    Card card = handDeck.get(0);
    handDeck.remove(0);
    return card;
  }

  public int compareTo(Person other) {
    int result = getGamesWon() - other.getGamesWon();
    return result;
  }
}
