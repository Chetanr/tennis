package main.java;
public class Match {


    private String playerA;
    private String playerB;
    private Score score;
    private final int DEUCE_SCORE = 4;


    /*
       Constructor
    */
    public Match(String playerA,String playerB){
        this.playerA = playerA;
        this.playerB = playerB;
        score = new Score();
    }


    /*
       Update the point for the particular player
    */
    public void pointWonBy(String player){
        int scoreARepresentation = score.getPlayerRepresentationSetScore(playerA);
        int scoreBRepresentation = score.getPlayerRepresentationSetScore(playerB);
        if (checkDeuce(scoreARepresentation, scoreBRepresentation)){
            score.updateDeuceScore(player);
        }
        else{
            score.updateSetScore(player);
        }

    }


    /*
       Display the scores, check if the set is being won
       and display the game score if a player wins the game
    */
    public void score(){
        int scoreARepresentation = score.getPlayerRepresentationSetScore(playerA);
        int scoreBRepresentation = score.getPlayerRepresentationSetScore(playerB);
        displaySetScore();
        if (checkDeuce(scoreARepresentation, scoreBRepresentation)){
            displayDeuceScore();
        }
        else if (checkGameWon(scoreARepresentation, scoreBRepresentation)) {
            String winningPlayer = winningPlayer(scoreARepresentation, scoreBRepresentation);
            score.updateGameScore(winningPlayer);
            displayGameScore();
            System.out.println(winningPlayer + " wins the game");
        }
    }


    /*
       display the deuce-game score
    */
    private void displayDeuceScore() {
        int deuceScoreA = score.getDeuceScore(playerA);
        int deuceScoreB = score.getDeuceScore(playerB);
        System.out.println("deuce score: " + deuceScoreA + "-" + deuceScoreB);
        if (deuceScoreA > deuceScoreB){
            System.out.println(playerA + " wins the game");
        }
        else {
            System.out.println(playerB + " wins the game");
        }
    }


    /*
       check for the deuce
    */
    private boolean checkDeuce(int scoreARepresentation,int scoreBRepresentation) {
        return (scoreARepresentation == DEUCE_SCORE && scoreBRepresentation == DEUCE_SCORE);
    }


    /*
       Display the set score
    */
    private void displaySetScore(){
        String playerASetScore = score.getSetScore(playerA);
        String playerBSetScore = score.getSetScore(playerB);
        System.out.println(playerASetScore + "-" + playerBSetScore);
    }


    /*
       Display the game score
    */
    private void displayGameScore(){
        int playerAGameScore = score.getGameScore(playerA);
        int playerBGameScore = score.getGameScore(playerB);
        System.out.println(playerAGameScore + "-" + playerBGameScore);
    }


    /*
       check who won the game
    */
    private boolean checkGameWon(int playerAScore, int playerBScore) {
        if ((playerAScore == 3 && playerBScore == 0) || ((playerAScore == 0 && playerBScore == 3)))
            return true;
        return scoreDifference(2, playerAScore, playerBScore) && (playerAScore == 4 || playerBScore == 4);
    }


    /*
       check the score difference of a set
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
