public class Card {
    private int ID;
    private Suit suit;
    private String label;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Card_Value getValue() {
        return value;
    }

    public void setValue(Card_Value value) {
        this.value = value;
    }

    // private int value;
    private Card_Value value;

    public Card(int  ID, Suit suit, String label,Card_Value value) {
        this.ID = ID;
        this.suit = suit;
        this.label = label;
        this.value = value;
    }
}
