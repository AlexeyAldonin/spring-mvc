package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String printCars(HttpServletRequest request, ModelMap model){
        int count = 0;
        String value = request.getParameter("count");
        if (value != null) {
            count += Integer.parseInt(value);
        }
        CarService service = new CarService();
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}
