public class Person
{
    // instance variables
    private int gameswon;
    private int score; //reset every new game
    
    public int hitlimit;
    
    public String name;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
        gameswon = 0;
        score = 0;
        hitlimit = 15;
    }

    public void incrementScore()
    {
        score = score + 1;
    }
    public void setScore(int givenscore)
    {
        score = givenscore;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void incrementGamesWon()
    {
        gameswon = gameswon + 1;
    }
}
