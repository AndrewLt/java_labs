package com.company;

public class Driver {
    public String firstName;
    public String lastName;
    public String birthDate;
    public boolean isActiveDriverLicense;
    public String companyCar = "";

    public Driver(String firstName, String secondName, String birthDate, boolean isActiveDriverLicense){
        this.firstName = firstName;
        this.lastName = secondName;
        this.birthDate = birthDate;
        this.isActiveDriverLicense = isActiveDriverLicense;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String setDriverCar(String carNumber){
        if (!isActiveDriverLicense) return "Driver license is not active";
        if (companyCar.length() > 0) return "Driver already have a car. Use changeCar() method";
        companyCar = carNumber;
        return "Car with gov number '" +carNumber+ "' set for driver " +firstName + " " + lastName;
    }

    public String getDriverInfo(){
        return firstName + " " + lastName + " " + companyCar;
    }

}
