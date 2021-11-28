package comp;

public class App {
    public static void main(String[] args) {
        Composite cc1 =  new Composite("Composite1");
        Leaf Leaf1 = (Leaf) cc1.add(new Leaf("Leaf1"));
        Composite cc01 = (Composite) cc1.add(new Composite("Composite01"));
        Composite cc02 = (Composite) cc1.add(new Composite("Composite02"));
        Composite cc3 = (Composite)  cc02.add(new Composite("Composite3"));
        Leaf Leaf03 = (Leaf) cc3.add(new Leaf("Leaf03"));


        cc1.view();
        cc1.remove(cc02);
        System.out.println("++++++++++++++ After removing Composite 2 ++++++++++++++++");
        cc1.view();
    }

}
