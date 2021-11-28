import observable.Observable;
import observable.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

public class TestObservers {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        ObserverImpl1 observer1 = new ObserverImpl1();
        ObserverImpl2 observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(20);
        System.out.println("*******************************");
        observable.setState(90);

        observable.unsubscribe(observer2);
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                int state = ((ObservableImpl)observable).getState();
                System.out.println("Anonymous Observer 1 : "+state);
            }
        });
        observable.subscribe(observable1 -> System.out.println("Anonymous Observer 3 with lambda : "+ ((ObservableImpl)observable1).getState()));

        observable.setState(90);

    }
}
