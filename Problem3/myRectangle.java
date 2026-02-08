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

    public int getArea() {
        return this.getWidth() * this.getHeight();
    }

    public int getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    public String toString() {
        return "topleft = " + this.topleft + " bottomright = " + this.bottomright;
    }

}
