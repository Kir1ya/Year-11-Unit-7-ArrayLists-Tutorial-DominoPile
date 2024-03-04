public class Domino {

    private int top;
    private int bottom;

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }
    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getSmall() {
        if (top > bottom) {
            return bottom;
        }
        return top;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
    public void flip() {
        int flipper = top;
        top = bottom;
        bottom = flipper;
    }
    public void settle() {
        if (top > bottom) {
            flip();
        }
    }
    public int compareTo(Domino other) {
        if (getSmall() < other.getSmall()) {
            return -1;
        }
        if (getSmall() > other.getSmall()) {
            return 1;
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        if (getTop() + getBottom() > other.getTop() + other.getBottom()) {
            return -1;
        }
        if (getTop() + getBottom() < other.getTop() + other.getBottom()) {
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other) {
        if (top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom) {
            return true;
        }
        return false;
    }

}