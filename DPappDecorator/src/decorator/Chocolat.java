package decorator;

import boisson.Boisson;

public class Chocolat extends Decorator {


    public Chocolat(Boisson b) {
        super(b);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }

    @Override
    public int cout() {
        return boisson.cout()+10;
    }
}
