package observerJDK;

import java.util.Observer;

public class SingleTest {

    public static void main(String[] args) {
        NumObservable numObservable=new NumObservable();

        Observer a=new NumObserver();

        numObservable.addObserver(a);

        numObservable.setData(1);
        numObservable.setData(2);
        numObservable.setData(3);



    }
}
