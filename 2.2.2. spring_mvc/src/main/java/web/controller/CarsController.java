package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String printCars(ModelMap model){
        CarService service = new CarService();
        List<Car> cars = service.getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }

}
