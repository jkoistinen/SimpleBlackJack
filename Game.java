public class Game
{
    // instance variables
    private int scorewon;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        
        scorewon = 21; //If Player or Dealer reaches this number the game is over.
    }

    public static void main(String args[]) {
    
    Deck myDeck = new Deck(); //creates a pre-shuffled deck of cards
    
    Card DealerCard = myDeck.getCard();
    Card PlayerCard = myDeck.getCard();
    
    System.out.println("Dealer got:"+DealerCard);
    System.out.println("Player got:"+PlayerCard);
    
    int result = DealerCard.compareTo(PlayerCard);
    
    if ( result > 0 ) {
    
        System.out.println("Dealer won!");
    
    }
    
    if ( result < 0 ) {
    
        System.out.println("Player won!");
    
    }
    
    if ( result == 0 ) {
    
        System.out.println("Both are winners!");
    
    }
    
    // 0 == equal
    // > 0 == myDeck.getCard().compareTo(myDeck.getCard()
   
    }
}
