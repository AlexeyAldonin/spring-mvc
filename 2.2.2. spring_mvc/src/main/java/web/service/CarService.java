package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarService {

    public List<Car> getCars() {
        return Arrays.asList(new Car("Lada", 2106, true),
                new Car("Land Rover", 4, false),
                new Car("BMW", 6, true));
    }
}
