package observers;

import observable.Observable;

public interface Observer{
    // Push technique ::
//    void update(int state);
    //Pop Technique ::
    void update(Observable observable);
}
