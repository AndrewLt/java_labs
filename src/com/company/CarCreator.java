package com.company;

public class CarCreator {
    public String brand;
    public String model;
    public Integer year;
    private final String carCNumber;

    public CarCreator(String brand, String model, Integer year, String carCNumber) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.carCNumber = carCNumber;
    }

    public String getModel(){
        return "This is " + brand + " " + model;
    }

    public String getNumber(){
        return carCNumber;
    }

}
