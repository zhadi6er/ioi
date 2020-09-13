package com.company.factory;

import com.company.factory.KiaModels.Optima;
import com.company.factory.KiaModels.Rio;

public class KiaFactory extends AbstractFactory{
    public String name;

    @Override
    public void buildModel(String model) {
        Car c;
        switch (model){
            case "Optima":
                c = new Optima();
                System.out.println(c.Car() + " " + c.getCarModel());
                break;
            case "Rio":
                c = new Rio();
                System.out.println(c.Car() + " " + c.getCarModel());
                break;
            default:
                System.out.println("There is no car with this model!");
        }
    }
}
