package observable;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubs() {
        for(Observer o:observers){
            //Technique PUSH !!!!!
//            o.update(state);
            //Technique POP !!!!
            o.update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifySubs();
    }
}
