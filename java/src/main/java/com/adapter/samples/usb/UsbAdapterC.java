package com.adapter.samples.usb;

public class UsbAdapterC implements UsbAdapterInter {
    private UsbC c = new UsbC();

    @Override
    public void connect() {
        c.connectC();
    }
}
