import Avion.avionImpl;
import State.EtatEnPiste;

public class App {
    public static void main(String[] args) {
        avionImpl avion = new avionImpl();

        avion.doActivity();
        System.out.println("--------------------------------------------");
        avion.decoller();
        avion.attirir();
        avion.entrerAuGarage();
        avion.doActivity();


    }
}
