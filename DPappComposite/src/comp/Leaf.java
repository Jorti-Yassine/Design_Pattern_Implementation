package comp;

public class Leaf extends Composant {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void view() {
        System.out.println(tab()+name);
    }
}
