package test;

import main.java.*;
import org.junit.*;



public class MatchTest{
    private static String playerOne = "player1";
    private static String playerTwo = "player2";

//    private main.java.Match match;

//    @Before
//    public void init(){
//        match = new Match(playerOne, playerTwo);
//    }

    @Test
    public void Match(){
        Match match = new Match(playerOne, playerTwo);
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.pointWonBy(playerOne);
    }
}