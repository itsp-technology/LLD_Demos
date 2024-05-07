package com.devices;

import com.observer.NewLatterObserver;

public class Tablet implements NewLatterObserver {
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
