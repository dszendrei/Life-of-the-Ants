/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life.of.the.ants.ants;

/**
 *
 * @author lewis
 */
public class Soldier extends Ant {
    
    int moveCount;
   
    public Soldier () {
        super();
        moveCount = 0;
    }
    
    @Override
    public void step() {
        if (moveCount == 4) moveCount = 0;
        switch (moveCount) {
            case 0:  moveUp();
                     break;
            case 1:  moveDown();
                     break;
            case 2:  moveLeft();
                     break;
            case 3:  moveRight();
                     break;
        }
        moveCount++;
    }
}
