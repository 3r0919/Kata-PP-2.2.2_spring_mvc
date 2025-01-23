package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList = new ArrayList<>();

    Car car1 = new Car("Toyota", 1999, "White");
    Car car2 = new Car("BMW", 1994, "Grey");
    Car car3 = new Car("Mercedes", 2019, "Black");
    Car car4 = new Car("Chery", 2024, "White");
    Car car5 = new Car("Volkswagen", 1999, "Blue");

    {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> getCountOfCar(Integer count) {
        if (count == 0 || count > 5) {
            return carList;
        } else {
            List<Car> limitedCarList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                limitedCarList.add(carList.get(i));
            }
            return limitedCarList;
        }
    }
}
