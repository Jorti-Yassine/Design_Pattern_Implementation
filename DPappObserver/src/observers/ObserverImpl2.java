package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl2 implements Observer {
    private int lastStatemnt;
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl)observable).getState();
        if(state > lastStatemnt)
            System.out.println("Observer 2  => Augmentation");
        else if(state < lastStatemnt)
            System.out.println("Observer 2 => Decreasing");
        else
            System.out.println("Observer 2 => Stable");

        lastStatemnt = state;
    }
}
