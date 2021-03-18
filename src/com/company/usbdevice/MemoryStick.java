package com.company.usbdevice;

public class MemoryStick implements USBDevice {

    private String name;
    private boolean ejected = false;


    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("MemoryStick Connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Please safely remove usb device");
            return false;
        } else {
            System.out.println("MemoryStick disconnected");
            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void eject(){
        ejected = true;
        System.out.println("You can safely remove usb device");
    }
}
