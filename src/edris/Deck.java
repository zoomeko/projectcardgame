package edris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
//deck class
public class Deck {

    ArrayList<Card> cards;


    final static String[]
                suits = {
                "Diamonds",
                "Clubs",
                "Hearts",
                "Spades"
        };

         static String[] value = { Card.Jack,Card.Queen,Card.King,
                Card.Ace, "3", "4", "5", "6", "7", "8", "9","10",};

        static LinkedList<Card> deck = new LinkedList<Card>();


        public  Deck() {

            for (String suit:suits) {

                for (String value : value) {
                    deck.add(new Card(suit,value));
                }
            }
            Collections.shuffle(cards);
        }
        public void computerDeck(){


            //


            Collections.shuffle(deck);
        }
        public void drawCard(LinkedList<Card>handOfCards)
        {
            handOfCards.push(deck.pop());
        }
        public Card drawCard() {
            return deck.pop();
        }

        public int cardsLeft()
        {
            return cards.size();
        }
    }


