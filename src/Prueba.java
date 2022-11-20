import Exceptions.StateException;
import States.*;

import java.util.LinkedList;
import java.util.List;

public class Prueba {


    public static void main(String[]args){
        List<Player> players = new LinkedList<>();


        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        players.add(new Player("Player 4"));

       printPlayer(players);
try {

    players.get(0).inPlay();

    printPlayer(players);

    players.get(0).inWait();
    players.get(1).inPlay();
    printPlayer(players);

    players.get(1).inWait();
    players.get(2).inPlay();

    printPlayer(players);

    players.get(2).inWait();
    players.get(3).inPlay();

    printPlayer(players);

    players.get(3).inWait();
    players.get(1).inPlay();
    printPlayer(players);

    players.get(1).inWin();
    players.get(0).inLoose();
    players.get(2).inLoose();
    players.get(3).inLoose();
    printPlayer(players);

    players.get(1).inWait();
    players.get(3).inWin();
    printPlayer(players);


}catch (StateException e){
    e.printStackTrace();
}finally {
    players.forEach(player -> {
        try {
            player.inWait();
        } catch (StateException e) {
            e.printStackTrace();
        }
    });

    printPlayer(players);
}




    }

    public static void printPlayer(List<Player> players){
        System.out.println("=======================================================================");
        players.forEach(player -> {

           if (player.getState() instanceof StatePlay) {System.out.println("\u001B[31m" +player + "\u001B[0m");}

            if (player.getState() instanceof StateWin) {System.out.println("\u001B[33m" +player + "\u001B[0m");}
             if (player.getState() instanceof StateLoose) {System.out.println("\u001B[32m" +player + "\u001B[0m");}
             {
               if (player.getState() instanceof StateWait) {System.out.println("\u001B[36m" +player + "\u001B[0m");}
           }

        });
    }


}
