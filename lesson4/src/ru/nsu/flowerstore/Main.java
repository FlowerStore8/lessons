package ru.nsu.flowerstore;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LeagueManagerImpl game = new LeagueManagerImpl();
        SC2Player player1 = new SC2Player("First", 0, League.PRACTICE, Race.TERRAN);
        SC2Player player2 = new SC2Player("Second", 5, League.GOLD, Race.ZERG);
        SC2Player player3 = new SC2Player("Third", 100, League.GOLD, Race.TERRAN);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        //System.out.println(game.getPlayer("First"));

        for (SC2Player player : game.getAllPlayers()) {
            //System.out.println(player);
        }
        //System.out.println();

        for (SC2Player player : game.getPlayers(Race.TERRAN)){
            //System.out.println(player);
        }
        //System.out.println();

        for (SC2Player player : game.getPlayers(League.GOLD)) {
            //System.out.println(player);
        }
        //System.out.println();

        game.addPoints("First", 15);
        //System.out.println(player1);

        game.removePlayer(player1);
        for (SC2Player player : game.getAllPlayers()) {
            System.out.println(player);
        }

    }
}
