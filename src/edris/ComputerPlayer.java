package edris;
import java.util.Scanner;
import java.util.Random;
public class ComputerPlayer {
        static Scanner stringScanner= new Scanner(System.in);
        static Card cardsWereUsing;
    static Deck ComputerPlayerDeckwereUsing;
        static Random randomGenerator;

        public static void main(String[] args) {
            int numberOfPlayers= 4;
            ComputerPlayerDeckwereUsing= new Deck();
            ComputerPlayerDeckwereUsing.computerDeck();
            Player[] players = new Player[numberOfPlayers];

            for (int x = 0;x<numberOfPlayers;x++){
                if(x == 0 ) {
                    players[x] = new Player("Player 1", false);
                }else{
                    players[x]= new Player("Computer"+ x, true);
                }
            }
            for (int y = 0; y<6;y++){
                for (Player player: players)
                    player.addToHandOfCards(ComputerPlayerDeckwereUsing.drawCard());
            }


        }




    }

