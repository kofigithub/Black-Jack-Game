
enum Card_Value {
    //Constants with values
    Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8),
    Nine(9), Ten(10), Jack(10), Queen(10), King(10), Ace(11);
    //Instance variable
    private int value;

    //Constructor to initialize the instance variable
    Card_Value(int value) {
        this.value = value;
    }

    public int getValue() {
        Card_Value values[] = Card_Value.values();

        return value;
    }
}


