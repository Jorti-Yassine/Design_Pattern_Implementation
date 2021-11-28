package boisson;

public class Expresso extends Boisson {

    public Expresso(){
        Description = "Expresso";
    }
    @Override
    public int cout() {
        return 20;
    }
}
