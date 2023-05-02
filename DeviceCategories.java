package com.company.device;

public enum DeviceCategories {
    SMALL("Мелкая бытовая техника", 0),
    BIG("Крупная бытовая техника", 1);

    private String name;
    private int number;

    DeviceCategories(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
