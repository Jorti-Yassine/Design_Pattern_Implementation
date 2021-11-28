package State;


import Avion.avionImpl;

public abstract class State {
    private avionImpl avion;
    public State(avionImpl avion){
        this.avion = avion;
    };
    public abstract void execentrerAuGarage();
    public abstract void execsortirDuGarage();
    public abstract void execdecoller();
    public abstract void execattirir();
    public abstract void execdoActivity();

    public avionImpl getAvion() {
        return avion;
    }

    public void setAvion(avionImpl avion) {
        this.avion = avion;
    }
}
