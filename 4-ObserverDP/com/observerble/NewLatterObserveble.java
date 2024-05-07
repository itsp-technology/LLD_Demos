package com.observerble;

import com.observer.NewLatterObserver;

import java.util.List;

public interface NewLatterObserveble {


    public void register(NewLatterObserver newLatterObserver) ;
    public  void removeRegsiter(NewLatterObserver newLatterObserver);

    public void notifyObserver();

}
