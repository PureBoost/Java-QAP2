package Problem4;

import Problem2.myLine;
import Problem3.myRectangle;

@SuppressWarnings("unused")
public class campusMap {

    private myRectangle scienceHall;
    private myRectangle library;
    private myRectangle lectureRoom1;
    private myRectangle lectureRoom2;
    private myRectangle lectureRoom3;
    private myRectangle lectureRoom4;
    private myRectangle lectureRoom5;

    private myCircle centralFountain;

    private myLine walkway1;
    private myLine walkway2;
    private myLine walkway3;
    private myLine walkway4;
    private myLine walkway5;
    private myLine walkway6;

    public campusMap() {
        
    }

    // Add
    public void addScienceHall(myRectangle scienceHall) {
        this.scienceHall = scienceHall;
    }

    public void addLibrary(myRectangle library) {
        this.library = library;
    }

    public void addLectureRoom1(myRectangle lectureRoom1) {
        this.lectureRoom1 = lectureRoom1;
    }

    public void addLectureRoom2(myRectangle lectureRoom2) {
        this.lectureRoom2 = lectureRoom2;
    }

    public void addLectureRoom3(myRectangle lectureRoom3) {
        this.lectureRoom3 = lectureRoom3;
    }

    public void addLectureRoom4(myRectangle lectureRoom4) {
        this.lectureRoom4 = lectureRoom4;
    }

    public void addLectureRoom5(myRectangle lectureRoom5) {
        this.lectureRoom5 = lectureRoom5;
    }

    public void addCentralFountain(myCircle centralFountain) {
        this.centralFountain = centralFountain;
    }

    public void addWalkway1(myLine walkway1) {
        this.walkway1 = walkway1;
    }

    public void addWalkway2(myLine walkway2) {
        this.walkway2 = walkway2;
    }

    public void addWalkway3(myLine walkway3) {
        this.walkway3 = walkway3;
    }

    public void addWalkway4(myLine walkway4) {
        this.walkway4 = walkway4;
    }

    public void addWalkway5(myLine walkway5) {
        this.walkway5 = walkway5;
    }

    public void addWalkway6(myLine walkway6) {
        this.walkway6 = walkway6;
    }


    // Calculate

    public double calculateTotalWalkwayLength() {
        double totalLength = 0;
        if (walkway1 != null) totalLength += walkway1.getLength();
        if (walkway2 != null) totalLength += walkway2.getLength();
        if (walkway3 != null) totalLength += walkway3.getLength();
        if (walkway4 != null) totalLength += walkway4.getLength();
        if (walkway5 != null) totalLength += walkway5.getLength();
        if (walkway6 != null) totalLength += walkway6.getLength();
        return totalLength;
    }

    public double calculateTotalFountainArea() {
        if (centralFountain != null) {
            return centralFountain.getArea();
        }
        return 0;
    }


    //this took me a long time i couldnt figure it out for a long while but i think i got it now. it checks if any of the walkways connect the two rectangles by checking if the endpoints of the walkway are in the rectangles.
    public boolean isWalkwayFromTo (myRectangle from, myRectangle to) {
        return connects(walkway1, from, to)
            || connects(walkway2, from, to)
            || connects(walkway3, from, to)
            || connects(walkway4, from, to)
            || connects(walkway5, from, to)
            || connects(walkway6, from, to);
    }

    private boolean connects(myLine line, myRectangle from, myRectangle to) {
        if (line == null || from == null || to == null) {
            return false;
        }

        int beginX = line.getBegin().getX();
        int beginY = line.getBegin().getY();
        int endX = line.getEnd().getX();
        int endY = line.getEnd().getY();

        boolean beginInFrom = isPointInRectangle(beginX, beginY, from);
        boolean endInTo = isPointInRectangle(endX, endY, to);
        if (beginInFrom && endInTo) {
            return true;
        }

        boolean beginInTo = isPointInRectangle(beginX, beginY, to);
        boolean endInFrom = isPointInRectangle(endX, endY, from);
        return beginInTo && endInFrom;
    }

    private boolean isPointInRectangle(int x, int y, myRectangle rect) {
        return x >= rect.getLeft() && x <= rect.getRight()
            && y >= rect.getBottom() && y <= rect.getTop();
    }
}
