package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl1 implements Observer {
    private int sum;

    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getState();
        sum+=state;
        System.out.println("Observer 1 => sum :"+sum);
    }
}
