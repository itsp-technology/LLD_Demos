package com.devices;

import com.observer.NewLatterObserver;

public class MobileDevice implements NewLatterObserver {

    private String name;
    public  MobileDevice(String name){
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name + " ===  "+ msg);
    }
}
