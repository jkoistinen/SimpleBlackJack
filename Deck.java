import java.util.*;
public class Deck
{
    // instance variables
    private static final List<Card> playDeck = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
            for(Card.Suit s : Card.Suit.values()){
             for(Card.Rank r : Card.Rank.values()) {
                 playDeck.add(new Card(r, s));
                }
    }
    
    Collections.shuffle(playDeck);
        

    }

    public static void main(String args[]) { 
        
    Deck myDeck = new Deck();

    
    for(int i = 0; i < myDeck.playDeck.size(); i++){
        
        //System.out.println(myDeck.playDeck.get(i));
    
    }
    
    myDeck.getCard();
    myDeck.getCard();
    myDeck.getCard();
    System.out.println(myDeck.playDeck.size());
    
    }
    public Card getCard(){
        Card card = playDeck.get(0);
        playDeck.remove(0);
        System.out.println("I will return:"+ card);
        return card;
    }
}

