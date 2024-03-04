import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public ArrayList getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                Domino domino = new Domino(i, j);
                pile.add(domino);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pile);
    }

}
