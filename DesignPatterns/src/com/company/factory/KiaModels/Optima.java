package com.company.factory.KiaModels;

import com.company.factory.Car;

public class Optima implements Car {
    @Override
    public String Car() {
        return "Kia";
    }

    @Override
    public String getCarModel() {
        return "Optima";
    }
}
