package Problem2;

public class myLine {
    private myPoint begin;
    private myPoint end;

    public myLine(int x1, int y1, int x2, int y2) {
        this.begin = new myPoint(x1, y1);
        this.end = new myPoint(x2, y2);
    }

    public myLine(myPoint begin, myPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public myPoint getBegin() {
        return this.begin;
    }

    public void setBegin(myPoint begin) {
        this.begin = begin;
    }

    public myPoint getEnd() {
        return this.end;
    }

    public void setEnd(myPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.x;
    }

    public void setBeginX(int x) {
        this.begin.x = x;
    }

    public int getBeginY() {
        return this.begin.y;
    }

    public void setBeginY(int y) {
        this.begin.y = y;
    }

    public int getEndX() {
        return this.end.x;
    }

    public void setEndX(int x) {
        this.end.x = x;
    }

    public int getEndY() {
        return this.end.y;
    }

    public void setEndY(int y) {
        this.end.y = y;
    }

    public int getBeginXY() {
        return this.begin.x + this.begin.y;
    }   

    public void setBeginXY(int x, int y) {
        this.begin.x = x;
        this.begin.y = y;
    }

    public int getEndXY() {
        return this.end.x + this.end.y;
    }

    public void setEndXY(int x, int y) {
        this.end.x = x;
        this.end.y = y;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.end.x - this.begin.x, 2) + Math.pow(this.end.y - this.begin.y, 2));
    }

    public double getGradient() {
        return Math.atan2(this.end.y - this.begin.y, this.end.x - this.begin.x);
    }

    public String toString() {
        return "begin=(" + this.begin.x + "," + this.begin.y + "),end=(" + this.end.x + "," + this.end.y + ")";
    }

}