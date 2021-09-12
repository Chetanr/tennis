package test;

import main.java.*;
import org.junit.*;


public class MatchTest{
    private static String playerOne = "player1";
    private static String playerTwo = "player2";

    private main.java.Match match;

    @Before
    public void init(){
        match = new Match(playerOne, playerTwo);
    }


    /*
        Test to check for 40-0 scenario
    */
    @Test
    public void Test1(){
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerOne);
        match.pointWonBy(playerOne);
        match.score();
    }


    /*
        Random Test
    */
    @Test
    public void Test2(){
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();

    }


    /*
        Test to check deuce game
    */
    @Test
    public void Test3(){
        match.pointWonBy(playerOne);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.score();
        match.pointWonBy(playerTwo);
        match.pointWonBy(playerOne);
        match.pointWonBy(playerOne);
        match.pointWonBy(playerOne);
        match.pointWonBy(playerTwo);
        match.pointWonBy(playerTwo);
        match.score();

    }
}