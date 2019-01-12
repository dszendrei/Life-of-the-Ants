
package life.of.the.ants;

import java.util.List;
import life.of.the.ants.ants.Ant;

public class Steps {
    private int step = 0;
    
    public void step(List<Ant> ants) {
        for (Ant ant: ants) {
            ant.step();
            ant.checkPresenceInGrid();
        }
    }
}
