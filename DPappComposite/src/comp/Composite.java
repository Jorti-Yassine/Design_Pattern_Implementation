package comp;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {
    protected List<Composant> composants = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    public Composant add(Composant c){
        c.level = this.level+1;
        composants.add(c);
        return c;
    }
    public void remove(Composant c){
        composants.remove(c);
    }

    @Override
    public void view() {
        System.out.println(tab()+this.name);
        for(Composant cc : composants)
                cc.view();

    }
}
