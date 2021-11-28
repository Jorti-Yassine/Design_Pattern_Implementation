package Avion;

import State.*;

public class avionImpl implements avion {
    private State state;
    public avionImpl(){
        this.state = new EtatEnPiste(this);
    }

    @Override
    public void entrerAuGarage() {
        state.execentrerAuGarage();
    }

    @Override
    public void sortirDuGarage() {
        state.execsortirDuGarage();

    }

    @Override
    public void decoller() {
        state.execdecoller();

    }

    @Override
    public void attirir() {
        state.execattirir();

    }

    @Override
    public void doActivity() {
        state.execdoActivity();

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
