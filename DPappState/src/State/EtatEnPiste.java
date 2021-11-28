package State;

import Avion.avionImpl;

public class EtatEnPiste extends State{
    public EtatEnPiste(avionImpl avion) {
        super(avion);
    }

    @Override
    public void execentrerAuGarage() {
        getAvion().setState( new EtatAuGarage(getAvion()));
    }

    @Override
    public void execsortirDuGarage() {
        System.out.println("Impossible: Je suis dans la piste ");

    }

    @Override
    public void execdecoller() {
        getAvion().setState( new EtatEnAir(getAvion()));
    }

    @Override
    public void execattirir() {
        System.out.println("Impossible d'attirir: Je suis dans la piste ");
    }

    @Override
    public void execdoActivity() {
        System.out.println("\n +++++++++++++++++++++++++ JE SUIS DANS L PISTE ++++++++++++++++++++++++++++++++++++\n");
    }
}
