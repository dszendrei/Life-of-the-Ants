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
public class Queen extends Ant {
    Position position = new Position(Position.getQueenPositionX(), Position.getQueenPositionY());
    int countdownToMate;
    boolean mateable;

    public int getCountdownToMate() {
        return countdownToMate;
    }
    
    public Queen () {
        resetCounter();
    }
    
    public void resetCounter () {
        countdownToMate = (int) Math.random()*100+100;
        mateable = false;
    }
    
    @Override
    public void step() {
        if (countdownToMate != 0){
            countdownToMate--;
        } else {
            mateable = true;
        }         
    }
    
}
