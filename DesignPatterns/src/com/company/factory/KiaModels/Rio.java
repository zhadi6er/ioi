package com.company.factory.KiaModels;

import com.company.factory.Car;

public class Rio implements Car {
    @Override
    public String Car() {
        return "Kia";
    }

    @Override
    public String getCarModel() {
        return "Rio";
    }
}
