package zadaci.zadatak3;

public class MainRobot {
    public static void main(String[] args) {
        final Robot theRobot = new Robot();
        theRobot.moveEast();
        theRobot.moveSouth();
        theRobot.moveSouth();
        theRobot.moveEast();

        System.out.println("Point X = " + theRobot.getPositionX());
        System.out.println("Point Y = " + theRobot.getPositionY());
        System.out.println("Number of moves = " + theRobot.getMoves());

        System.out.println("The Euclidean distance = " + theRobot.getDistance());

        theRobot.printLastPosition(2);
    }
}
