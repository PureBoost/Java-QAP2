package Problem3;

public class myPoint {
    public int x = 0;
    public int y = 0;

    public myPoint() {
        this.x = 0;
        this.y = 0;
    }

    public myPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
