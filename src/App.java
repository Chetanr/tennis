import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Match match = new Match("player1", "player2");
        while(true){
            System.out.println("Point won by :");
            Scanner sc = new Scanner(System.in);
            String player = sc.next();
            match.pointWonBy(player);
            match.score();
            sc.close();
        }

    }
}
