package main.java;
import java.util.ArrayList;
import java.util.Arrays;


/*
   This class is used to map the scores in order to increment the score
*/
public class ScoreMapper {
    private ArrayList<String> scores = new ArrayList<>(Arrays.asList("0", "15", "30", "40", "ad"));

     public String getMapper(int scoreToBeMapped){
        return scores.get(scoreToBeMapped);
    }
}
