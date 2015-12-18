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
        
    Game myGame = new Game();
    
    Deck myDeck = new Deck(); //creates deck of cards
    myDeck.shuffle(); //shuffle your deck of cards
    
    Dealer myDealer = new Dealer();
    Player myPlayer = new Player();
    
    boolean startGame = false;
    boolean dealersTurn = false;
    boolean newRound = false;
    boolean quitGame = false;
    
    System.out.println("Welcome to BlackJackCasino");
    System.out.println("Your dealer is: "+myDealer.name);
    System.out.println("Instructions for playing: H(hit),S(stop) or Q(quit)");
    System.out.print("Start new game? (Y/N) ");
    
    //scanner stuff capture the y or n
    //String input = keyboard.next().trim().toUpperCase();
    
    String input = "Y";
        
    if(input.equals("Y")){
    startGame = true;
    System.out.println("Starting new game...");
    
    //Dealer shows first card for every new round.
    Card dealercard = myDeck.getCard();
    myDealer.addScore(dealercard.getValue());
    System.out.println("Dealer got: "+dealercard);
    
    } else if(input.equals("N")){
    startGame = false;
    System.out.println("Bye!");
    
    }
    
    //nested while loop for game starts here
    while(true) {
        
    if(quitGame == true) {
    //Show total gameswon scores for both Player and Dealer and announce winner!
    System.out.println( "Player won: "+myPlayer.getGamesWon() );
    System.out.println( "Dealer won: "+myDealer.getGamesWon() );
    System.out.println("Bye!");
    break;
    }
    
    if(newRound == true){
    System.out.println("------------------------------------------");
    System.out.print("Would you like to play a new round? (Y/N) ");
    Scanner keyboard = new Scanner(System. in );
    String in = keyboard.next().trim().toUpperCase();
    
    if(in.equals("Y")){
    newRound = false;
    //clear both Player and Dealer scores for the new round.
    myPlayer.clearScore();
    myDealer.clearScore();
    //System.out.println(startGame);
    
    //Dealer shows first card for every new round.
    Card dealercard = myDeck.getCard();
    myDealer.addScore(dealercard.getValue());
    System.out.println("Dealer got: "+dealercard);
    
    startGame = true;
    } else if(in.equals("N")){ 
    startGame = false;
    newRound = false;
    quitGame = true;
    }
    
    }
    
    //is startGame a good name ?
    while(startGame == true){
     
    Card playercard = myDeck.getCard();
    System.out.println( "Player got: "+playercard );
    //add points to Player-object
    myPlayer.addScore(playercard.getValue());
    System.out.println( "Players total is now: "+myPlayer.getScore());
    
    //check that we did not go over int scorewon
    if(myPlayer.getScore() > myGame.scorewon){
    System.out.println("Busted! Point to Dealer!");
    myDealer.incrementGamesWon();
    newRound = true;
    break;
    }
    
    //check if we got blackjack
     if(myPlayer.getScore() == myGame.scorewon){
    System.out.println("Win! Point to Player!");
    myPlayer.incrementGamesWon();
    newRound = true;
    break;
    }
    
    System.out.print( "H(hit),S(stop) or Q(quit) ");
    Scanner keyboard = new Scanner(System. in );
    String choice = keyboard.next().trim().toUpperCase();
    if(choice.equals("H")){
    startGame = true;
    
    } else if(choice.equals("S")){
    dealersTurn = true;
    startGame = false;
    break;
    }
    
    else if(choice.equals("Q")){
    startGame = false;
    newRound = false;
    quitGame = true;
    break;
    }
    }
    
    if(dealersTurn == true) {
    System.out.println("Dealers turn...");
    }
    
    while(dealersTurn == true){
    
        Card dealercard = myDeck.getCard();
        System.out.println( "Dealer got: "+dealercard );
        //add points to Dealer-object
        myDealer.addScore(dealercard.getValue());
        System.out.println( "Dealers total is now: "+myDealer.getScore());
        
        //check that we did not go over int scorewon
        if(myDealer.getScore() > myGame.scorewon){
        System.out.println("Busted! Point to Player!");
        myPlayer.incrementGamesWon();
        dealersTurn = false;
        newRound = true;
        break;
        }
        
        //check if Dealer got blackjack
         if(myDealer.getScore() == myGame.scorewon){
        System.out.println("Win! Point to Dealer!");
        myDealer.incrementGamesWon();
        newRound = true;
        break;
        }
        
        //Dealer will try and pick until its over the Player score or will stop at 
        // Dealers hitlimit
        if(myDealer.getScore() < myPlayer.getScore()){
        dealersTurn = true;
        } else if(myDealer.getScore() > myPlayer.getScore() && myDealer.getScore() <= myGame.scorewon ){
        System.out.println("Dealer won!");
        myDealer.incrementGamesWon();
        dealersTurn = false;
        newRound = true;
        break;
        }
        
    }
    
}

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
