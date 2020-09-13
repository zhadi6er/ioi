package com.company.factory;

public class AutoCenter {
    public AutoCenter(String carMark, String model)
    {
        if(carMark.equals("Kia"))
        {
            KiaFactory k = new KiaFactory();
            k.buildModel(model);
        }
        else if(carMark.equals("Honda"))
        {
            HondaFactory h = new HondaFactory();
            h.buildModel(model);
        }
        else
        {
            System.out.println("We have only Kia and Honda!");
        }
    }
}
