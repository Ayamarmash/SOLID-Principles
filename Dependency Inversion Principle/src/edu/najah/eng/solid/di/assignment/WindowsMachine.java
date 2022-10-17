package edu.najah.eng.solid.di.assignment;

import edu.najah.eng.solid.di.assignment.devices.Keyboard;
import edu.najah.eng.solid.di.assignment.devices.Monitor;
import edu.najah.eng.solid.di.assignment.devices.Switchable;

public class WindowsMachine {

    public final Switchable keyboard;
    public final Switchable monitor;

    public WindowsMachine(){
        monitor = new Monitor();  
        keyboard = new Keyboard(); 
    }

    public void changeDeviceStatus(Switchable Device, boolean status){
        if (status){
            Device.powerOn();
        } else {
            Device.powerOff();
        }
    }

}
