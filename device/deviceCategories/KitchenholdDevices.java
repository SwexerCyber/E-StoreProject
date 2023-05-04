package com.company.device.deviceCategories;
import com.company.device.Device;

public class KitchenholdDevices extends Device{
    private int funcAmount;

    public int getFuncAmount() {
        return funcAmount;
    }

    public void setFuncAmount(int funcAmount) {
        this.funcAmount = funcAmount;
    }

    @Override
    public String toString() {
        return super.toString() + " function amount: " + funcAmount;
    }
}
