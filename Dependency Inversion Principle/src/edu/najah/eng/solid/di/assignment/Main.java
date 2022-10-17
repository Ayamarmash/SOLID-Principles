package edu.najah.eng.solid.di.assignment;

public class Main {

    public static void main(String[] args) {
        WindowsMachine x = new WindowsMachine();
        x.changeDeviceStatus(x.keyboard, true);
        x.changeDeviceStatus(x.monitor, true);
    }
}