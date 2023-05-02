package com.company.device.deviceCategories.householdDevices;
import com.company.device.DeviceCategories;
import com.company.device.deviceCategories.HouseholdDevices;

public class TV extends HouseholdDevices {
    public TV(int price, int number, String naming,
                        int releaseDate, int power, boolean isWireless, DeviceCategories device){
        setPrice(price);
        setNumber(number);
        setNaming(naming);
        setReleaseDate(releaseDate);
        setPower(power);
        setWireless(isWireless);
        setTurnedOn(false); // чтобы объект был выключен по дефолту
        setDeviceCategories(device);
    }

    @Override
    public String toString() {
        return "TV: " + super.toString();
    }
}
