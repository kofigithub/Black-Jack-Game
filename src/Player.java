import java.util.Arrays;
import java.util.List;

public class Player {
    private int ID;
    private String Name;
    private List<Card> playercardlist ;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPlayercardlist(List<Card> playercardlist) {
        this.playercardlist = playercardlist;
    }

    public Player(int ID, String name, List<Card> playercardlist) {
        this.ID = ID;
        this.Name = name;
        this.playercardlist = playercardlist;
    }

    public List<Card> getPlayercardlist() {
        return playercardlist;
    }

   /* public void setPlayercardlist(List<Card> playercardlist) {
        this.playercardlist = Arrays.asList(new Card(1, Suit.HEARTS, "hearts", Card_Value.Queen));
    }*/
}
