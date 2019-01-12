/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life.of.the.ants.grid;

/**
 *
 * @author lewis
 */
public class Position {
    
    private static int maxX = 100;
    private static int maxY = 100;
    private static int queenPositionX = maxX / 2;
    private static int queenPositionY = maxY / 2;
    int x;
    int y;
    
    public Position () {
        do {
            x = (int) Math.random()*maxX;
        }
        while (x != queenPositionX);
        do {
            y = (int) Math.random()*maxY;
        }
        while (y != queenPositionY);
    }
    
    public Position (int setX, int setY) {
        x = setX;
        y = setY;
    }
    
    public static int stepsFromQueen (int x, int y) {
        return Math.abs(queenPositionX-x)+Math.abs(queenPositionY-y);
    }
    
    public static int stepsFromQueenX (int x) {
        return x-queenPositionX;
    }
    
    public static int stepsFromQueenY (int y) {
        return y-queenPositionY;
    }
    
    public static int getMaxX() {
        return maxX;
    }

    public static int getMaxY() {
        return maxY;
    }

    public static int getQueenPositionX() {
        return queenPositionX;
    }

    public static int getQueenPositionY() {
        return queenPositionY;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
