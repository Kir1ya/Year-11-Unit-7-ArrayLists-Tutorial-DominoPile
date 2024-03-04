import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DominoPileTester {

    private DominoPile dominoPile;

    public void setUp() {
        dominoPile = new DominoPile();
    }

    public void tearDown() {
        dominoPile = null;
    }

    @Test
    public void testConstructor() {
        setUp();
        assertTrue(dominoPile != null, "Ensure that your constructor in the DominoPile class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testGetPile() {
        setUp();
        assertTrue(dominoPile.getPile() != null, "Ensure that your getPile method in the DominoPile class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testNewStack6AllDominosPresent() {
        setUp();
        int top = 0;
        int bottom = 0;
        dominoPile.newStack6();
        System.out.println(dominoPile.getPile());
        for (int i = 0; i < dominoPile.getPile().size(); i++) {
            assertTrue(((Domino) dominoPile.getPile().get(i)).getTop() == top, "Ensure that your newStack6 method in the DominoPile class has been implemented correctly!");
            assertTrue(((Domino) dominoPile.getPile().get(i)).getBottom() == bottom, "Ensure that your newStack6 method in the DominoPile class has been implemented correctly!");
            System.out.println("Expected Top: " + top + " Observed Top: " + ((Domino) dominoPile.getPile().get(i)).getTop());
            System.out.println("Expected Bottom: " + bottom + " Observed bottom: " + ((Domino)dominoPile.getPile().get(i)).getBottom());
            if (bottom == 6) {
                top++;
                bottom = top;
            }
            else {
                bottom++;
            }
        }

        tearDown();
    }

    @Test
    public void testNewStack6AllNoDuplicates() {
        setUp();
        dominoPile.newStack6();
        System.out.println(dominoPile.getPile().size());
        assertTrue(dominoPile.getPile().size() == 28, "Ensure that your newStack6 method in the DominoPile class has been implemented correctly!");
        tearDown();
    }

    /** Note that there is a very small probability that this test fails on a correct implementation.
     *  This is because there is a very small chance that the call to shuffleOptionOne produces a
     *  result that shuffles the tiles into the same order as they were originally.
     *  This would cause this test to fail, despite the implementation of shuffleOptionOne being correct.
     */
   @Test
   public void testShuffle() {
        setUp();
        dominoPile.newStack6();
        dominoPile.shuffle();
        int top = 0;
        int bottom = 0;
        boolean allInSameOrder = true;
        for (int i = 0; i < dominoPile.getPile().size(); i++) {
            if (!(((Domino) dominoPile.getPile().get(i)).getTop() == top && ((Domino) dominoPile.getPile().get(i)).getBottom() == bottom)) allInSameOrder = false;

            if (bottom == 6) {
                top++;
                bottom = top;
            }

            bottom++;
        }
       assertTrue(!allInSameOrder, "Ensure that your shuffleOption1 method in the DominoPile class has been implemented correctly!");
   }

   
}
