package edu.najah.eng.solid.di.assignment.devices;

public class Monitor implements Switchable{

    public void powerOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void powerOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }
}