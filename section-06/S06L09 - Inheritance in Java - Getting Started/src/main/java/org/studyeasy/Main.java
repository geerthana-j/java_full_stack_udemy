package org.studyeasy;


import org.studyeasy.vehicles.Bike;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.handle = "Short";
        bike.engine = "Petrol";
        System.out.println(bike.engine);

    }
}
