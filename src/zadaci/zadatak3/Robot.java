package zadaci.zadatak3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Robot {
    private int X;
    private int Y;
    private int initialX;
    private int initialY;
    private int countMoves;
    private List<Point> moves;

    public Robot(){
        this.X = 0;
        this.Y = 0;
        this.moves = new ArrayList<>();
    }
    public Robot(final int x, final int y){
        this.X = x;
        this.Y = y;
        this.moves = new ArrayList<>();
    }

    public void moveSouth(){
        this.Y = this.Y - 1;
        this.X = this.X;
        Point currentPosition = new Point(X,Y);
        moves.add(currentPosition);
        countMoves = countMoves + 1;
    }
    public void moveNorth(){
        this.Y = this.Y + 1;
        this.X = this.X;
        Point currentPosition = new Point(X,Y);
        moves.add(currentPosition);
        countMoves = countMoves + 1;
    }
    public void moveEast(){
        this.X = this.X + 1;
        this.Y = this.Y;
        Point currentPosition = new Point(X,Y);
        moves.add(currentPosition);
        countMoves = countMoves + 1;
    }
    public void moveWest(){
        this.X = this.X - 1;
        this.Y = this.Y;
        Point currentPosition = new Point(X,Y);
        moves.add(currentPosition);
        countMoves = countMoves + 1;
    }

    public int getPositionX(){
        return X;
    }
    public int getPositionY(){
        return Y;
    }
    public double getDistance(){
        return Math.sqrt(Math.pow(initialX - X, 2) + Math.pow(initialY - Y, 2));
    }
    public int getMoves(){
        return countMoves;
    }

    public void printLastPosition(final int n){
        int movesToPrint = n - countMoves;
        if(n<=getMoves()){
        for(int i = countMoves - 1; i >= countMoves - n; i--){
            System.out.println(moves.get(i));
            }
        }
        else {
            System.out.println("Chose a number smaller or equal to number of moves.");
        }
    }
}
