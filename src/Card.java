public class Card {

    private Suit suit;
    private CardValue cardValue;
    private int value;


    public Card( Suit suit,CardValue cardValue, int value) {

        this.suit = suit;
        this.cardValue = cardValue;
        this.value = value;
    }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }





}
