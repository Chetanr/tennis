public class Match {


    private String playerA;
    private String playerB;
    private Score score;


    /*
        Constructor
    */
    public Match(String player1,String player2){
        playerA = player1;
        playerB = player2;
        score = new Score();
    }


    /*
        Update the point for the particular player
    */
    public void pointWonBy(String player){
        score.updateSetScore(player);
    }


    /*
        Display the scores, check if the set is being won
        and display the game score if a player wins the game
    */
    public void score(){
        int scoreARepresentation = score.getPlayerRepresentationSetScore(playerA);
        int scoreBRepresentation = score.getPlayerRepresentationSetScore(playerB);
        displaySetScore();
        if (isGameWon(scoreARepresentation, scoreBRepresentation)){
            String winningPlayer = winningPlayer(scoreARepresentation, scoreBRepresentation);
            score.updateGameScore(winningPlayer);
            displayGameScore();
        }
    }


    /*
        Display the set score
    */
    public void displaySetScore(){
        String playerASetScore = score.getSetScore(playerA);
        String playerBSetScore = score.getSetScore(playerB);
        System.out.println(playerASetScore + "-" + playerBSetScore);
    }


    /*
        Display the game score
    */
    public void displayGameScore(){
        int playerAGameScore = score.getGameScore(playerA);
        int playerBGameScore = score.getGameScore(playerB);
        System.out.println(playerAGameScore + "-" + playerBGameScore);
    }


    /*
        check who won the game
    */
    private boolean isGameWon(int playerAScore, int playerBScore) {
        return scoreDifference(2, playerAScore, playerBScore) && (playerBScore == 4 || playerBScore == 4);
    }


    /*
        check the score difference
    */
    private boolean scoreDifference(int difference, int playerAScore, int playerBScore) {
        return Math.max(playerAScore, playerBScore) - Math.min(playerAScore, playerBScore) >= difference;
    }


    /*
        find the winning player
    */
    private String winningPlayer(int scoreARepresentation, int scoreBRepresentation){
        return (scoreARepresentation > scoreBRepresentation) ? playerA : playerB;
    }   
}
