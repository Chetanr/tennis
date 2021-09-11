import java.util.HashMap;

/*
    This class is used to map the scores in order to increment the score
*/
public class ScoreMapper {
    HashMap<Integer, Integer> score = new HashMap<>();

    public ScoreMapper(){
        score.put(0, 15);
        score.put(15, 30);
        score.put(30, 40);
    }

    public int scoreUpdater(int scoreToBeMapped){
        return score.get(scoreToBeMapped);
    }
}
