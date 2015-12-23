public class Person implements Comparable<Person>
{
    // instance variables
    private int gameswon;
    private int score; //reset every new round

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

    public void clearScore()
    {
        score = 0;
    }

    public void addScore(int givenscore)
    {
        score = score + givenscore;
    }

    public int getScore()
    {
        return score;
    }

    public void incrementGamesWon()
    {
        gameswon = gameswon + 1;
    }

    public int getGamesWon()
    {
        return gameswon;
    }

    public int compareTo(Person other)
    {
        int result = getGamesWon() - other.getGamesWon();

        return result;
    }
}
