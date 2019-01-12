/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life.of.the.ants.ants;

import life.of.the.ants.grid.Position;

/**
 *
 * @author lewis
 */
public class Drone extends Ant {
    private boolean mating = false;
    private int waitCounter;
    private Queen queen;
    
    public Drone(Queen queen) {
        super();
        this.waitCounter = 10;
        this.queen = queen;
    }
    
    @Override
    public void step(){
        if (!mating) {
            if (Position.stepsFromQueenX(position.getX()) < 0) {
                moveRight();
            } else if (Position.stepsFromQueenX(position.getX()) > 0) {
                moveLeft();
            } else {
                if (Position.stepsFromQueenY(position.getY()) < 0) {
                    moveUp();
                } else if (Position.stepsFromQueenY(position.getY()) > 0) {
                    moveDown();
                }
            }
            if (Position.stepsFromQueen(position.getX(), position.getY()) < 4) {
                checkQueenStatus();
            }
        } else if (waitCounter == 0){
            position = new Position();
            waitCounter = 10;
        } else {
            waitCounter--;
        }
    }
    
    private void checkQueenStatus() {
        if (queen.mateable){
            mating = true;
            System.out.println("HALLELUJAH");
        } else {
            position = new Position();
            System.out.println("D’OH");
            waitCounter = 10;
        }
    }
        
}
