package com.company;

public class AutoPark {
    private Driver[] driversList;
    public AutoPark(Driver[] list) {
        driversList = list;
    }

    public void printDriverList()
    {
        for(Driver driver:driversList)
            System.out.println(driver.getDriverInfo());
    }

    public String findDriverByName(String driverName) {
        StringBuilder result = new StringBuilder("Results: \n");
        for(Driver driver:driversList) {
            if(driver.getFullName().toLowerCase().contains(driverName.toLowerCase()))
                result.append(driver.getFullName()+"\n");
        }
        return result.toString();
    }

}
