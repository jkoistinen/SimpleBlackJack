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
    
    System.out.println("Welcome to BlackJackCasino");
    
    
    System.out.println("Your dealer is: "+myDealer.name);
    System.out.println("Instructions for playing: H(hit),S(stop) or Q(quit)");
    System.out.println("Start new game? y/n");
    
    //scanner stuff capture the y or n
    //String input = keyboard.next().trim().toUpperCase();
    
    boolean startGame = false;
    boolean dealersTurn = false;
    boolean newRound = false;
    
    String input = "Y";
    
    if(input.equals("Y")){
    startGame = true;
    System.out.println("Starting new game...");
    } else if(input.equals("N")){
    startGame = false;
    System.out.println("Bye!");
    
    }
    
    //nested while loop for game starts here
    while(true) {
    if(newRound){
    System.out.print("Would you like to play a new round? y/n");
    }
    
//     if(input.equals("Y")){
//     
//     }
        
    //is startGame a good name ?
    while(startGame == true){
    
    Card playercard = myDeck.getCard();
    System.out.println( "You got: "+playercard );
    //add points to Player-object
    myPlayer.addScore(playercard.getValue());
    System.out.println( "Your total is now: "+myPlayer.getScore());
    
    //check that we did not go over int scorewon
    if(myPlayer.getScore() > myGame.scorewon){
    System.out.println("Busted! Point to Dealer!");
    //and also give the actual point
    newRound = true;
    break;
    }
    
    //check if we got blackjack
     if(myPlayer.getScore() == myGame.scorewon){
    System.out.println("Win! Point to Player!");
    //and also give the actual point
    }
    
    System.out.println( "H(hit),S(stop) or Q(quit)");
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
    break;
    //print out both Player and Dealer total times won
    //check who has highest gameswon and announce the winner (or tie)!
    
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
        //and also give the actual point
        dealersTurn = false;
        newRound = true;
        break;
        }
        
        //check if Dealer got blackjack
         if(myDealer.getScore() == myGame.scorewon){
        System.out.println("Win! Point to Dealer!");
        //and also give the actual point
        newRound = true;
        }
        
        //Dealer will try and pick until its over the Player score or will stop at 
        // Dealers hitlimit
        if(myDealer.getScore() < myPlayer.getScore()){
        dealersTurn = true;
        } else if(myDealer.getScore() > myPlayer.getScore() && myDealer.getScore() <= myGame.scorewon ){
        System.out.println("Dealer won!");
        //and also give the actual point
        dealersTurn = false;
        newRound = true;
        break;
        }
        
    }
    
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
