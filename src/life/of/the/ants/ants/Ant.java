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
public abstract class Ant {
    protected Position position;
    protected int distanceFromQueen;
    
    public Ant () {
        this.position = new Position();
        this.distanceFromQueen = Position.stepsFromQueen(position.getX(), position.getY());
    }
    
    public void step(){}
    
    public void checkPresenceInGrid() {
        if (position.getX() < 0 || position.getY() < 0 || position.getX() > Position.getMaxX() || position.getY() > Position.getMaxY() )  this.position = new Position();
    }
    
    void moveUp(){
        position.setY(position.getY()+1);
    }
    
    void moveDown(){
        position.setY(position.getY()-1);
    }
    
    void moveRight(){
        position.setX(position.getX()+1);
    }
    
    void moveLeft(){
        position.setX(position.getX()-1);
    }
    
}
