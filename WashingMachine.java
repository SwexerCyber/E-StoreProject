package com.company.device.deviceCategories.householdDevices;
import com.company.device.DeviceCategories;
import com.company.device.deviceCategories.HouseholdDevices;

public class WashingMachine extends HouseholdDevices {
    public WashingMachine(int price, int number, String naming,
                        int releaseDate, int power, boolean isWireless, DeviceCategories device){
        setPrice(price);
        setNumber(number);
        setNaming(naming);
        setReleaseDate(releaseDate);
        setPower(power);
        setWireless(isWireless);
        setTurnedOn(false);
        setDeviceCategories(device);
    }

    @Override
    public String toString() {
        return "Washing machine: " + super.toString();
    }
}
