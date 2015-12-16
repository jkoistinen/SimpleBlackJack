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
    public final Rank rank;
    public final Suit suit;
    
    public Rank rank() { return rank; }
    public Suit suit() { return suit; }
    public String toString() { return suit +" "+ rank; }
    
    /**
     * Constructor for objects of class Card
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

}