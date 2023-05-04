package com.company.device.deviceCategories.kitchenholdDevices;
import com.company.device.deviceCategories.KitchenholdDevices;

public class Fridge extends KitchenholdDevices {
    public Fridge(int price, int number, String naming,
                     int releaseDate, int power, boolean isWireless, int funcAmount){
        setPrice(price);
        setNumber(number);
        setNaming(naming);
        setReleaseDate(releaseDate);
        setPower(power);
        setWireless(isWireless);
        setTurnedOn(false);
        setFuncAmount(funcAmount);
    }

    @Override
    public String toString() {
        return "Fridge: " + super.toString();
    }
}
