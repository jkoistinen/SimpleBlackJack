import java.util.*;

public class Card
{

    public enum Suit {
        SPADER, 
        HJÄRTER, 
        RUTER, 
        KLÖVER;
}

    public enum Rank {
        ESS (1),
        TVÅ (2),
        TRE (3),
        FYRA (4),
        FEM (5),
        SEX (6),
        SJU (7),
        ÅTTA (8),
        NIO (9),
        TIO (10),
        KNEKT (10),
        DAM (10),
        KUNG (10);
        
        int value;
       Rank(int v) {
          value = v;
       }
       
       int showValue() {
          return value;
       } 
    
}
    private final Rank rank;
    private final Suit suit;
    
    public Rank rank() { return rank; }
    public Suit suit() { return suit; }
    public String toString() { return rank + " of " + suit; }
    
    private static final List<Card> playDeck = new ArrayList<Card>();
    
    /**
     * Constructor for objects of class Card
     */
    private Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public static void main(String args[]) {

    //Card myCard = new Card(2, "SPADER");
    Collections.shuffle(playDeck);
        for(Suit s : Suit.values()){
             for(Rank r : Rank.values()) {
                 System.out.println( s +" "+ r + " har värdet " + r.showValue() );
                 playDeck.add(new Card(r, s));
                }
    }
    
    System.out.println(playDeck.size());
    playDeck.remove(0);
    System.out.println(playDeck.size());
    System.out.println(playDeck.get(0));
    playDeck.remove(0);
    System.out.println(playDeck.get(0));
    
    
                    
   }
}