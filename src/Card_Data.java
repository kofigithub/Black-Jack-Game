import java.util.Arrays;
import java.util.List;

public class Card_Data {

       /* static List<Card> cardlist = Arrays.asList(
        new Card(1, Suit.HEARTS, "hearts", Card_Value.Queen),
        new Card(2, Suit.DIAMONDS, "diamonds", Card_Value.Two),
        new Card(3, Suit.CLUBS, "clubs", Card_Value.Two),
        new Card(4, Suit.SPADES, "spades", Card_Value.Two));*/

    public static void getValues(int model_value) {

        Card_Value values[] = Card_Value.values();

    }

        public static void main(String[] ags){

            Card card = new Card(1,Suit.HEARTS,"hearts",Card_Value.Three);
            System.out.println(Card_Value.Three.getValue());
             Player player1 = new Player(5, "K",List);
            System.out.println(player1);
        }
}
