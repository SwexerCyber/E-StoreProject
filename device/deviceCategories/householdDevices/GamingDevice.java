package com.company.device.deviceCategories.householdDevices;
import com.company.device.DeviceCategories;
import com.company.device.deviceCategories.HouseholdDevices;

public class GamingDevice extends HouseholdDevices {
    public GamingDevice(int price, int number, String naming,
                        int releaseDate, int power, boolean isWireless, DeviceCategories device){
        setPrice(price);
        setNumber(number);
        setNaming(naming);
        setReleaseDate(releaseDate);
        setPower(power);
        setWireless(isWireless);
        setDeviceCategories(device);
    }

    @Override
    public String toString() {
        return "Gaming device: " + super.toString();
    }
}
