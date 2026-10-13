package Shreyansh.collection.ComparatorAndComparable;

import java.util.Arrays;

public class ObjectCollectionSorting {
    public static void main(String[] args) {
        Car[] carArray =new Car[3];
        carArray[0] = new Car("SUV","petrol");
        carArray[1] = new Car("Sedan","diesel");
        carArray[2] = new Car("HatchBack","CNG");

        Arrays.sort(carArray,(Car obj1,Car obj2)->obj2.carType.compareTo(obj1.carType));
        for (Car car:carArray){
            System.out.println(car.carName + ".." + car.carType);
        }
    }
}
