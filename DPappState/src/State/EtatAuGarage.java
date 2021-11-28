package State;

import Avion.avionImpl;

public class EtatAuGarage extends State{
    public EtatAuGarage(avionImpl avion) {
        super(avion);
    }

    @Override
    public void execentrerAuGarage() {
        System.out.println("Impossible: Je suis dans le Garage ");
    }

    @Override
    public void execsortirDuGarage() {
        getAvion().setState( new EtatEnPiste(getAvion()));

    }

    @Override
    public void execdecoller() {
        System.out.println("Impossible: Je suis dans le Garage ");
    }

    @Override
    public void execattirir() {
        System.out.println("Impossible: Je suis dans le Garage ");
    }

    @Override
    public void execdoActivity() {
        System.out.println("\n +++++++++++++++++++++++++ JE SUIS DANS Le GARAGE ++++++++++++++++++++++++++++++++++++\n");
    }
}
