public class Score {

    /*
        gameScore is used to record the scores of the game
        setScore is used to record the scores of a particular set
    */
    int gameScore;
    int setScore;
    ScoreMapper scoreMapper;
    private static final int DEUCE_SCORE = 40;

    public Score(){
        gameScore = 0;
        setScore = 0;
        scoreMapper = new ScoreMapper();
    }

    /*
        update the particular score
    */
    public void update(){
        int point = getSetScore();
        setScore = scoreMapper.scoreUpdater(point);
    }

    /*
        check if the score is deuce
    */
    // public boolean checkDeuce(Player player1, Player player2){
    //     if (setScores.get(player1) == DEUCE_SCORE && setScores.get(player2) == DEUCE_SCORE){
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    /*
        get the set score of the particular player
    */
    public int getSetScore(){
        return setScore;
    }

    /*
        get the game score of the particular player
    */
    public int getGameScore(){
        return gameScore;
    }

}
