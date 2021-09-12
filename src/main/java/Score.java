package main.java;
public class Score {

    /*
       gameScore is used to record the scores of the game
       setScore is used to record the scores of a particular set
    */
    private int[] setScore;
    private int[] gameScore;
    private int[] deuceScore;
    private ScoreMapper scoreMapper;

    /*
       constructor to initialize class variables
    */
    public Score(){
        setScore = new int[]{0,0};
        gameScore = new int[]{0,0};
        deuceScore = new int[]{0,0};
        scoreMapper = new ScoreMapper();
    }

    /*
       update the particular set score
    */
    public void updateSetScore(String player){
        int playerIndex = playerIndex(player);
        setScore[playerIndex]  = setScore[playerIndex] + 1;
    }


    /*
       get the index of the player
    */
    private int playerIndex(String player){
        return player.equals("player1") ? 0 : 1;
    }


    /*
       update the particular game score
    */
    public void updateGameScore(String player){
        int playerIndex = playerIndex(player);
        gameScore[playerIndex]  = gameScore[playerIndex] + 1;
    }


    /*
       update the deuce score
    */
    public  void updateDeuceScore(String player){
        int playerIndex = playerIndex(player);
        deuceScore[playerIndex]  = deuceScore[playerIndex] + 1;
    }


    /*
       get the set deuce score of the particular player
    */
    public int getDeuceScore(String player){
        int playerIndex = playerIndex(player);
        return deuceScore[playerIndex];
    }


    /*
       get the set score of the particular player
    */
    public String getSetScore(String player){
        return scoreMapper.getMapper(getPlayerRepresentationSetScore(player));
    }


    /*
       get the player represenation set score
    */
    public int getPlayerRepresentationSetScore(String player){
        int playerIndex = playerIndex(player);
        return setScore[playerIndex];
    }


    /*
       get the game score of the particular player
    */
    public int getGameScore(String player){
        return gameScore[playerIndex(player)];
    }
}
