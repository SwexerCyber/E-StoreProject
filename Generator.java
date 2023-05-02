package com.company;
import com.company.device.Device;
import com.company.device.DeviceCategories;
import com.company.device.deviceCategories.householdDevices.GamingDevice;
import com.company.device.deviceCategories.householdDevices.TV;
import com.company.device.deviceCategories.householdDevices.WashingMachine;
import com.company.device.deviceCategories.kitchenholdDevices.Fridge;
import com.company.device.deviceCategories.kitchenholdDevices.Microwave;
import com.company.device.deviceCategories.kitchenholdDevices.Oven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Generator { // ШАБЛОН ФАБРИКИ!
    public static Device generate(int num){
        Random rand = new Random();
        switch (num){
            case 0:
                return new GamingDevice(rand.nextInt(300), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5) == 0 ? DeviceCategories.SMALL : DeviceCategories.BIG); // используем тернарный оператор

            case 1:
                return new TV(rand.nextInt(500), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5) == 0 ? DeviceCategories.SMALL : DeviceCategories.BIG);

            case 2:
                return new WashingMachine(rand.nextInt(150), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5) == 0 ? DeviceCategories.SMALL : DeviceCategories.BIG);

            case 3:
                return new Fridge(rand.nextInt(200), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5));

            case 4:
                return new Microwave(rand.nextInt(100), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5));

            case 5:
                return new Oven(rand.nextInt(150), rand.nextInt(50),
                        Integer.toString(rand.nextInt(5)), rand.nextInt(2023),
                        rand.nextInt(100), rand.nextInt(5) % 2 != 0,
                        rand.nextInt(5));
        }

        return null;
    }

    public static ArrayList<Device> randomTurnedOn(ArrayList<Device> devices){
        Random rand = new Random();
        // 1 способ
//        for (int i = 0; i < devices.size(); i++) {
////          1 способ в 1 способе
////          Device device = devices.remove(i);
////          device.setTurnedOn(rand.nextBoolean());
////          devices.add(i, device);
//
//            // 2 способ во 2 способе
//            Device device = devices.get(i);
//            device.setTurnedOn(rand.nextBoolean());
//            devices.set(i, device);
//        }
//
//        // 2 способ
//        for (Device device : devices) {
//            device.setTurnedOn(rand.nextBoolean());
//        }

        // 3 способ
//        Iterator<Device> iterator = devices.iterator();
//        while (iterator.hasNext()) {
//            Device device = iterator.next();
//            device.setTurnedOn(rand.nextBoolean());
//            devices.set(devices.indexOf(device), device);
//        }
//   4 способ
        ListIterator<Device> it = devices.listIterator();
        while (it.hasNext()) {
            Device device = it.next();
            device.setTurnedOn(rand.nextBoolean());
            it.set(device);
        }
        return devices;
    }
}