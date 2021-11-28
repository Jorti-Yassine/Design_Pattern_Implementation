import boisson.Boisson;
import boisson.Lavazza;
import decorator.Chocolat;
import decorator.Vanille;

public class App {
    public static void main(String[] args) {
        Boisson boisson = new Lavazza();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------------");
        boisson =new Vanille(new Chocolat(boisson));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("-----------------------------------");


    }
}
