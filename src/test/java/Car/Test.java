package Car;

import creditCard.CardService;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        car.carColor="black";
        car.carBreak="ABS";
        car.carName="BNW";
        car.gears="6";

        car.engine.fuelType="Petrol";
        car.engine.chasesNO="NBOU465678";



        CarService carService=new CarService();
        carService.getCar(car);

        System.out.println(carService.getCar(car));



    }
}
