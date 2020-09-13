package com.company.factory;

import com.company.factory.HondaModels.Accord;
import com.company.factory.HondaModels.Fit;
import com.company.factory.KiaModels.Optima;
import com.company.factory.KiaModels.Rio;

public class HondaFactory extends AbstractFactory{
    @Override
    public void buildModel(String model) {
        Car c;
        switch (model){
            case "Fit":
                c = new Fit();
                System.out.println(c.Car() + " " + c.getCarModel());
                break;
            case "Accord":
                c = new Accord();
                System.out.println(c.Car() + " " + c.getCarModel());
                break;
            default:
                System.out.println("There is no car with this model!");
        }
    }
}