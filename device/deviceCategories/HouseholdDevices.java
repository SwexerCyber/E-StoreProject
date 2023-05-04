package com.company.device.deviceCategories;
import com.company.device.Device;
import com.company.device.DeviceCategories;

public class HouseholdDevices extends Device {
    private DeviceCategories deviceCategories;

    public DeviceCategories getDeviceCategories() {
        return deviceCategories;
    }

    public void setDeviceCategories(DeviceCategories deviceCategories) {
        this.deviceCategories = deviceCategories;
    }

    @Override
    public String toString() {
        String str = deviceCategories == DeviceCategories.BIG ? "big" : "small"; // тернарный оператор
        return super.toString() + " " + "size: " + str;
    }
}
