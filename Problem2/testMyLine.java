package Problem2;

public class testMyLine {
	public static void main(String[] args) {
		myLine line1 = new myLine(1, 2, 4, 6);
		System.out.println(line1);
		System.out.println("Length: " + line1.getLength());
		System.out.println("Gradient: " + line1.getGradient());

		myPoint p1 = new myPoint(0, 0);
		myPoint p2 = new myPoint(3, 4);
		myLine line2 = new myLine(p1, p2);
		System.out.println(line2);
		System.out.println("Length: " + line2.getLength());
		System.out.println("Gradient: " + line2.getGradient());

		System.out.println("Begin point: " + line2.getBegin().x + "," + line2.getBegin().y);
		System.out.println("End point: " + line2.getEnd().x + "," + line2.getEnd().y);
		line2.setBegin(new myPoint(9, 10));
		line2.setEnd(new myPoint(11, 12));
		System.out.println("After setBegin/setEnd: " + line2);

		System.out.println("Begin X: " + line2.getBeginX());
		System.out.println("Begin Y: " + line2.getBeginY());
		System.out.println("End X: " + line2.getEndX());
		System.out.println("End Y: " + line2.getEndY());
		line2.setBeginX(13);
		line2.setBeginY(14);
		line2.setEndX(15);
		line2.setEndY(16);
		System.out.println("After setBeginX/Y and setEndX/Y: " + line2);

		System.out.println("Begin XY: " + line2.getBeginXY());
		System.out.println("End XY: " + line2.getEndXY());
		line2.setBeginXY(5, 6);
		line2.setEndXY(7, 8);
		System.out.println("After set XY: " + line2);

		System.out.println("Length after changes: " + line2.getLength());
		System.out.println("Gradient after changes: " + line2.getGradient());
	}
}
