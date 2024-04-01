package com.adapter.samples.usb;

public class Main {
    public static void main(String[] args) {
        UsbAdapterInter a = new UsbAdapterA();
        UsbAdapterInter c = new UsbAdapterC();
        a.connect();
        c.connect();
    }
}
