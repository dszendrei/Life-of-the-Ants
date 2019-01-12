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
public class Worker extends Ant {
    public Worker () {
        super();
    }
    
    @Override
    public void step() {
        int rand = (int) Math.random()*4;
        switch (rand) {
            case 0:  moveUp();
                     break;
            case 1:  moveDown();
                     break;
            case 2:  moveLeft();
                     break;
            case 3:  moveRight();
                     break;
        }
    }

}
