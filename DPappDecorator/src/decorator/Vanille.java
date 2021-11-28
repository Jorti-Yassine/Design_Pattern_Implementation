package decorator;

import boisson.Boisson;

public class Vanille extends Decorator{
    public Vanille(Boisson b) {
        super(b);
    }

    @Override
    public int cout() {
        return boisson.cout()+5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au vanille";
    }
}
