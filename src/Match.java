public class Match {
    Player playerA;
    Player playerB;
    Score score;
    public Match(String player1,String player2){
        playerA = new Player();
        playerB = new Player();
    }

    public void pointWonBy(String player){
        Player targetPlayer = getPlayer(player);
        targetPlayer.updateScore();
    }

    public Player getPlayer(String player){
        if (player.equals("player1")) {
            return playerA;
        }
        return playerB;
    }

    public void getScore(){

    }

    public void score(){
        int playerAScore = playerA.getSetScore();
        int playerBScore = playerB.getSetScore();
        System.out.println(playerAScore + "-" + playerBScore);
    }
}
