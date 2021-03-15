package com.company;

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Andrew", "Lutsiuk", "28.12.98",
                true);
        CarCreator car1 = new CarCreator("Audi", "A6", 2011, "ВС4545АА");
        d1.setDriverCar(car1.getNumber());

        Driver d2 = new Driver("Ihor", "Utvert", "19.11.93",
                true);
        CarCreator car2 = new CarCreator("Audi", "A6", 2012, "ВС4555АА");
        d2.setDriverCar(car2.getNumber());

        Driver d3 = new Driver("Stanislav", "Pavlishchuk", "12.05.95",
                true);
        CarCreator car3 = new CarCreator("Audi", "A6", 2011, "ВС4577АА");
        d3.setDriverCar(car3.getNumber());

    Driver[] spl1 = {d1, d2, d3};
    AutoPark autP = new AutoPark(spl1);
    autP.printDriverList();
    String name = "A";
    System.out.println(autP.findDriverByName(name));
    }
}
