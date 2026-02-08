package Problem3;

public class myRectangle {
    private myPoint topleft;
    private myPoint bottomright;
    
    public myRectangle() {
        this.topleft = new myPoint(0, 0);
        this.bottomright = new myPoint(1, 1);
    }

    public myRectangle(myPoint topleft, myPoint bottomright) {
        this.topleft = topleft;
        this.bottomright = bottomright;
    }

    public int getWidth() {
        return this.bottomright.getX() - this.topleft.getX();
    }

    public int getHeight() {
        return this.topleft.getY() - this.bottomright.getY();
    }

    public int getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    public int getLeft() {
        return Math.min(this.topleft.getX(), this.bottomright.getX());
    }

    public int getRight() {
        return Math.max(this.topleft.getX(), this.bottomright.getX());
    }

    public int getTop() {
        return Math.max(this.topleft.getY(), this.bottomright.getY());
    }

    public int getBottom() {
        return Math.min(this.topleft.getY(), this.bottomright.getY());
    }

    public String toString() {
        return "topleft = " + this.topleft + " bottomright = " + this.bottomright;
    }
    
    // had to change from getArea to myArea because it caused errors in problem 4 and this was the only way i found to fix it.
    public int myArea() {
        return this.getWidth() * this.getHeight();
    }

}
