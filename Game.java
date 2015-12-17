import java.util.Scanner;
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
    
    Deck myDeck = new Deck(); //creates deck of cards
    myDeck.shuffle(); //shuffle your deck of cards
    
    Dealer myDealer = new Dealer();
    Player myPlayer = new Player();
    
    System.out.println("Welcome to BlackJackCasino");
    
    
    System.out.println("Your dealer is: "+myDealer.name);
    System.out.println("Instructions for playing: H(hit),S(stop) or Q(quit)");
    System.out.println("Start new game? y/n");
    
    //scanner stuff capture the y or n
    //String input = keyboard.next().trim().toUpperCase();
    
    boolean startGame;
    
    String input = "Y";
    
    if(input.equals("Y")){
    startGame = true;
    System.out.println("Starting new game...");
    } else if(input.equals("N")){
    startGame = false;
    System.out.println("Bye!");
    
    }
    
    while(startGame = true){
    
    Card card = myDeck.getCard();
    System.out.println( "You got: "+card );
    //add points to Player-object
    myPlayer.addScore(card.getValue());
    System.out.println( "Your total is now: "+myPlayer.getScore());
    
    System.out.println( "H(hit),S(stop) or Q(quit)");
    Scanner keyboard = new Scanner(System. in );
    String choice = keyboard.next().trim().toUpperCase();
    System.out.println(choice);
    
    
    }
//     myPlayer.setScore(10);
//     int testscore = myPlayer.getScore();
//     System.out.println(testscore);
//     
//     Card card = myDeck.getCard();
//     
//     System.out.println("Dealer gotXYZ:"+myDeck.getCard());
//     
//     //Two cards to Dealer
//     
//     
//     Card DealerCard = myDeck.getCard();
//     Card PlayerCard = myDeck.getCard();
//     
//     System.out.println("Dealer got:"+DealerCard);
//     System.out.println("Player got:"+PlayerCard);
//     
//     //int result = DealerCard.compareTo(PlayerCard);
//     int result = myDeck.getCard().compareTo(myDeck.getCard());
//     
//     if ( result > 0 ) {
//     
//         System.out.println("Dealer won!");
//     
//     }
//     
//     if ( result < 0 ) {
//     
//         System.out.println("Player won!");
//     
//     }
//     
//     if ( result == 0 ) {
//     
//         System.out.println("Both are winners!");
//     
//     }
       
    }
}
