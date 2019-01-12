
package life.of.the.ants;

import java.util.List;
import life.of.the.ants.ants.*;


public class LifeOfTheAnts {

  
    public static void main(String[] args) {
        // TODO code application logic here
        LifeOfTheAnts simulation = new LifeOfTheAnts();
        simulation.init();
        simulation.loop();
    }
    
    private List<Ant> ants;
    
    private void init() {
        Queen queen = new Queen();
        ants.add(queen);
        for (int i = 0; i < 10; i++){
            ants.add(new Drone(queen));
            ants.add(new Soldier());
            ants.add(new Worker());
        }
    }
    
    private void loop () {
        Steps steps = new Steps();
        for (int i = 0; i < 1000; i++){
            steps.step(ants);
        }
    }
}
