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
    
    Deck myDeck = new Deck(); //create a pre-shuffled deck of cards
    
    myDeck.getCard();
   
    }
}
