import java.util.Scanner;

public class Game {
  // instance variables
  private int scorewon;

  /**
  * Constructor for objects of class Game
  */
  public Game() {
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
    System.out.println("Your dealer is: " + myDealer.name);
    System.out.println("Instructions for playing: H(hit),S(stop) or Q(quit)");

    Scanner startgame = new Scanner(System.in);
    System.out.print("Start new game? (Y/N) ");
    while (!startgame.hasNext("[ynYN]")) {
      System.out.print("Type in Y or N: ");
      startgame.next();
    }
    String input = startgame.next().trim().toUpperCase();

    if (input.equals("Y")) {
      startGame = true;
      System.out.println("Starting new game...");

      //clear both Player and Dealer scores for the new round.
      myPlayer.clearScore();
      myDealer.clearScore();

      //Dealer shows first card for every new round.
      Card card1 = myDeck.getCard();
      Card card2 = myDeck.getCard();

      myDealer.addCard( card1 );
      myDealer.addCard( card2 );

      System.out.println("Dealer got: " + myDealer.getCard());
      System.out.println("Dealer got: HIDDEN");
      System.out.println("Dealers total is now: " + card1.getValue());

    } else if (input.equals("N")) {
      startGame = false;
      System.out.println("Bye!");
      System.exit(0); // 0 is not a error, user choose to exit. IF you want to exit because of error set it to 1.
    }

    //nested while loop for game starts here
    while (true) {

      if (newRound == true) {
        System.out.println("------------------------------------------");
        System.out.print("Would you like to play a new round? (Y/N) ");
        Scanner keyboard = new Scanner(System. in );
        while (!keyboard.hasNext("[ynYN]")) {
          System.out.print("Type in Y or N: ");
          keyboard.next();
        }
        String in = keyboard.next().trim().toUpperCase();

        if (in.equals("Y")) {
          newRound = false;
          //clear both Player and Dealer scores for the new round.
          myPlayer.clearScore();
          myDealer.clearScore();

          Card card1 = myDeck.getCard();
          Card card2 = myDeck.getCard();

          myDealer.addCard( card1 );
          myDealer.addCard( card2 );

          System.out.println("Dealer got: " + card1 );
          System.out.println("Dealer got: HIDDEN");
          System.out.println("Dealers total is now: " + card1.getValue() );



          startGame = true;
        } else if (in.equals("N")) {
          startGame = false;
          newRound = false;
          quitGame = true;
        }

      }

      if (quitGame == true) {
        //Show total gameswon scores for both Player and Dealer!
        System.out.println( "Player won: " + myPlayer.getGamesWon() );
        System.out.println( "Dealer won: " + myDealer.getGamesWon() );

        //Announce the winner
        int result = myPlayer.compareTo(myDealer);
        //System.out.println("RESULT:"+result);

        if ( result > 0 ) {
          System.out.println("Player won!");

        } else if ( result < 0 ) {
          System.out.println("Dealer won!");

        } else if ( result == 0 ) {
          System.out.println("Tie Game!");
        }
        System.out.println("Bye!");

        break;
      }

      while (startGame == true) {

        Card card1 = myDeck.getCard();
        myPlayer.addCard( card1 );
        System.out.println( "Player got: " + card1 );
        System.out.println( "Players total is now: " + myPlayer.getScore() );

        //check that we did not go over int scorewon
        if (myPlayer.getScore() > myGame.scorewon) {
          System.out.println("Busted! Point to Dealer!");
          myDealer.incrementGamesWon();
          newRound = true;
          dealersTurn = false;
          break;
        }

        //check if we got blackjack
        if (myPlayer.getScore() == myGame.scorewon) {
          //System.out.println("Win! Point to Player!");
          //myPlayer.incrementGamesWon();
          System.out.println("Player got 21, lets see what the dealer gets ...");
          newRound = true;
          dealersTurn = true;
          break;
        }

        System.out.print( "H(hit),S(stop) or Q(quit) ");
        Scanner keyboard = new Scanner(System. in );
        while (!keyboard.hasNext("[hsqHSQ]")) {
          System.out.print("Type in H, S or Q ");
          keyboard.next();
        }
        String choice = keyboard.next().trim().toUpperCase();
        if (choice.equals("H")) {
          startGame = true;

        } else if (choice.equals("S")) {
          dealersTurn = true;
          startGame = false;
          break;
        } else if (choice.equals("Q")) {
          startGame = false;
          newRound = false;
          quitGame = true;
          break;
        }
      } //END while

      if (dealersTurn == true) {
        System.out.println("Dealers turn...");
      }

      while (dealersTurn == true) {

        //Check second card (card2)
        System.out.println( "Dealer got: " + myDealer.getCard() );
        System.out.println( "Dealers total is now: " + myDealer.getScore() );

        //check that we did not go over int scorewon
        if (myDealer.getScore() > myGame.scorewon) {
          System.out.println("Busted! Point to Player!");
          myPlayer.incrementGamesWon();
          dealersTurn = false;
          newRound = true;
          break;
        }

        //check if Dealer got blackjack
        if (myDealer.getScore() == myGame.scorewon) {
          System.out.println("Win! Point to Dealer!");
          myDealer.incrementGamesWon();
          dealersTurn = false;
          newRound = true;
          break;
        }

        //Dealer will try and pick until its over the Player score
        // Dealer has a hitlimit of 17, he needs to keep on picking cards until he has atleast 17.
        if (myDealer.getScore() < myPlayer.getScore() || myDealer.getScore() < myDealer.hitlimit ) {
          dealersTurn = true;

          //add new card to Dealers handDeck
          myDealer.addCard( myDeck.getCard() );

        } else if (myDealer.getScore() > myPlayer.getScore() && myDealer.getScore() <= myGame.scorewon ) {
          System.out.println("Dealer won!");
          myDealer.incrementGamesWon();
          dealersTurn = false;
          newRound = true;
          break;
        }
      } //END while
    } //END while
  }
}
