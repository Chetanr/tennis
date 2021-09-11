public class Player {
    Score score;

    public Player(){
        score = new Score();
    }

    public void updateScore(){
        score.update();
    }

    public int getSetScore(){
        return score.getSetScore();
    }
    
}
