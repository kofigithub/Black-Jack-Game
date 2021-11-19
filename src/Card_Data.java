import java.util.ArrayList;
import java.util.Collections;

public class Card_Data {
    static ArrayList<Card> deck = new ArrayList<>();

    public static void shuffle(){
        Collections.shuffle(deck);
    }

        public static void main(String[] args){

         for (Suit suit : Suit.values()) {

                for (CardValue cv : CardValue.values() ){
                    deck.add(new Card(suit,cv,cv.getValue()));

                }

            }


         shuffle();

            for (Card c : deck){

                System.out.println(c.getValue()+"   "+c.getSuit());
                System.out.println("--------");
            }


        }
}
