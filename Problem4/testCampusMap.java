package Problem4;

import Problem2.myLine;
import Problem2.myPoint;
import Problem3.myRectangle;

public class testCampusMap {
	public static void main(String[] args) {
		campusMap map = new campusMap();

		myRectangle scienceHall = new myRectangle(new Problem3.myPoint(0, 10), new Problem3.myPoint(4, 6));
		myRectangle library = new myRectangle(new Problem3.myPoint(6, 10), new Problem3.myPoint(10, 6));
		myRectangle lectureRoom1 = new myRectangle(new Problem3.myPoint(20, 20), new Problem3.myPoint(24, 16));

		map.addScienceHall(scienceHall);
		map.addLibrary(library);
		map.addLectureRoom1(lectureRoom1);
		map.addCentralFountain(new myCircle(5, 5, 2));

		myLine walkway1 = new myLine(new myPoint(2, 8), new myPoint(8, 8));
		myLine walkway2 = new myLine(new myPoint(1, 7), new myPoint(3, 7));

		map.addWalkway1(walkway1);
		map.addWalkway2(walkway2);

		System.out.println("Walkway length: " + map.calculateTotalWalkwayLength());
		System.out.println("Central fountain area: " + map.calculateTotalFountainArea());
		System.out.println("Science to Library: " + map.isWalkwayFromTo(scienceHall, library));
		System.out.println("Library to Science: " + map.isWalkwayFromTo(library, scienceHall));
		System.out.println("Science to LectureRoom1: " + map.isWalkwayFromTo(scienceHall, lectureRoom1));
	}
}
