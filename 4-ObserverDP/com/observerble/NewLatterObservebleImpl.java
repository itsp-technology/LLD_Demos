package com.observerble;

import com.observer.NewLatterObserver;

import java.util.ArrayList;
import java.util.List;

public class NewLatterObservebleImpl implements NewLatterObserveble {

    private List<NewLatterObserver> newLatterObserverList;
  private   String msg ;
    public NewLatterObservebleImpl(){
        newLatterObserverList = new ArrayList<>();
    }
    @Override
    public void register(NewLatterObserver newLatterObserver) {
        newLatterObserverList.add(newLatterObserver);

    }

    @Override
    public void removeRegsiter(NewLatterObserver newLatterObserver) {
        newLatterObserverList.remove(newLatterObserver);
    }

    @Override
    public void notifyObserver() {
        for(NewLatterObserver nl : newLatterObserverList){
            nl.update(msg);
        }
    }



    public void addProduct(String prodName){
        msg = prodName + " Item is Add to Stock please buy this ";
        notifyObserver();
    }
}
