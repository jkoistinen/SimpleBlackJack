public class Game
{
    // instance variables
    private int x;
    private int scorewon;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        x = 0;
        scorewon = 21; //If Player or Dealer reaches this number the game is over.
    }

    public static void main(String args[]) {
    Deck myDeck = new Deck();
    
    myDeck.getCard();
    myDeck.getCard();
    myDeck.getCard();
    }
}
