package Problem4;

public class myCircle {
    private myPoint center;
    private int radius = 1;

    public myCircle() {
        this.radius = 1;
        this.center = new myPoint();
    }

    public myCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new myPoint(x,y);
    }

    public myCircle(myPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(myPoint center) {
        this.center = center;
    }

    public myPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);

    }

    public int[] getCenterXY() {
        int a[] = new int[2];
        a[0] = this.center.getX();
        a[1] = this.center.getY();
        return a;
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return ("Center = " + this.center + " and radius = " + this.radius);
    }

    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }
    public double distance(myCircle c) {
        return(this.center.distance(c.center));
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }
  
}