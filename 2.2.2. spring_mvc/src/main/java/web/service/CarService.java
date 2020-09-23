package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Lada", 2106, true));
        list.add(new Car("Jaguar", 351, true));
        list.add(new Car("Land Rover", 405, false));
        list.add(new Car("Niva", 7, true));
        list.add(new Car("Zaporozhets", 1, true));
        if (count > 0) {
            int toDelete = list.size() - count;
            for (int i = 0; i < toDelete; i++) {
                list.remove(list.size() - 1);
            }
        }
        return list;
    }
}
