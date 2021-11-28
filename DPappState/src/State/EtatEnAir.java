package State;

import Avion.avionImpl;

public class EtatEnAir extends State{
    public EtatEnAir(avionImpl avion) {
        super(avion);
    }

    @Override
    public void execentrerAuGarage() {
        System.out.println("Impossible: Je suis dans l'air");

    }

    @Override
    public void execsortirDuGarage() {
        System.out.println("Impossible: Je suis dans l'air");

    }

    @Override
    public void execdecoller() {
        System.out.println("Impossible: Je suis dans l'air");
    }

    @Override
    public void execattirir() {
        getAvion().setState(new EtatEnPiste(getAvion()));
    }

    @Override
    public void execdoActivity() {
        System.out.println("\n +++++++++++++++++++++++++ JE SUIS DANS L 'AIR ++++++++++++++++++++++++++++++++++++\n");
    }
}
