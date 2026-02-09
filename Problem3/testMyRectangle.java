package Problem3;

public class testMyRectangle {
	public static void main(String[] args) {
		myRectangle r1 = new myRectangle();
		System.out.println("Default rectangle: " + r1);
		System.out.println("Width: " + r1.getWidth());
		System.out.println("Height: " + r1.getHeight());
		System.out.println("Area: " + r1.myArea());
		System.out.println("Perimeter: " + r1.getPerimeter());

		myPoint tl = new myPoint(2, 8);
		myPoint br = new myPoint(10, 3);
		myRectangle r2 = new myRectangle(tl, br);
		System.out.println("Custom rectangle: " + r2);
		System.out.println("Width: " + r2.getWidth());
		System.out.println("Height: " + r2.getHeight());
		System.out.println("Area: " + r2.myArea());
		System.out.println("Perimeter: " + r2.getPerimeter());
	}
}
