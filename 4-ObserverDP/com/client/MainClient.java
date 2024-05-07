package com.client;

import com.devices.MobileDevice;
import com.devices.Tablet;
import com.observerble.NewLatterObservebleImpl;

public class MainClient {

    public static void main(String[] args) {
        NewLatterObservebleImpl newLatterObserveble = new NewLatterObservebleImpl();

        MobileDevice md = new MobileDevice("Mobile Device 1");
        MobileDevice md1 = new MobileDevice("Mobile Device 2");
        MobileDevice md2 = new MobileDevice("Mobile Device 3");
        newLatterObserveble.register(md);
        newLatterObserveble.register(md1);
        newLatterObserveble.register(md2);

        Tablet tablet  = new Tablet();
        newLatterObserveble.register(tablet);

        newLatterObserveble.addProduct("Fairan Lavely");




    }
}
