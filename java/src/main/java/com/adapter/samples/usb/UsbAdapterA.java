package com.adapter.samples.usb;

public class UsbAdapterA implements UsbAdapterInter {

    private UsbA a = new UsbA();

    @Override
    public void connect() {
        a.connectA();
    }
}
