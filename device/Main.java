package com.company;
import com.company.device.Device;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------------------------------------------------Delivering devices------------------------------------------------------");
        System.out.println();

        ArrayList<Device> devices = new ArrayList<Device>();
        for (int i = 0; i < 6; i++) {
            devices.add(Generator.generate(i));
            System.out.println(devices.get(i));
        }

        System.out.println();
        System.out.println("------------------------------------------------------Turning on devices------------------------------------------------------");
        System.out.println();

        ArrayList<Device> randomTurnedOnDevices = Generator.randomTurnedOn(devices);
        Iterator<Device> iterator = randomTurnedOnDevices.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("------------------------------------------------------Counting total power------------------------------------------------------");
        System.out.println();

        int sumPower = 0;
        for (Device randomTurnedOnDevice : randomTurnedOnDevices) {
            if (randomTurnedOnDevice.isTurnedOn()) {
                sumPower += randomTurnedOnDevice.getPower();
            }
        }
        System.out.println("Total power: " + sumPower + "W");
    }
}
