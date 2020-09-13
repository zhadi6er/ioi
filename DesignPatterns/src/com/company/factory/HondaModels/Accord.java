package com.company.factory.HondaModels;

import com.company.factory.Car;

public class Accord implements Car {
    @Override
    public String Car() {
        return "Honda";
    }

    @Override
    public String getCarModel() {
        return "Accord";
    }
}
