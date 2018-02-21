package edris;

public class Card {

    final static String Queen = "Q";
    final static String King = "K";
    final static String Jack = "J";
    final static String Ace = "A";
    // value and suit of the card

    String value;
    String suitt;

        public Card(String val, String suitt) {
            this.value = val;
            this.suitt = suitt;
        }

        public Card(int val, String suitt) {

            this.value = convertNumberToCardVal(val);
            this.suitt = suitt;

        }
//geting value and returning
        public String getValue()
        {
            return value;
        }
//setting the value
        public void setValue(String value) {
            this.value = value;

        }
        //getting the suit and returing

        public String getSuit()
        {
            return suitt;
        }
        //setting the suit

        public void setSuit(String suit)
        {
            this.suitt = suit;
        }
        //getting ace card and returning

        public static String getAce() {
            return Ace;
        }


        public String convertNumberToCardVal(int val)
        {
            //  cards  value and returning the card

            if (val == 1) {
                return Ace;
            } else if (val == 2) {
                return Jack;
            } else if (val == 3) {
                return Queen;
            } else if (val == 4) {
                return King;

            } else {
                return Integer.toString(val);
            }
        }
        @Override
        public String toString() {
            return value +  " of " + suitt;
        }


    }


