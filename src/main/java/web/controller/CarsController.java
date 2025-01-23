package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarServiceImpl;


@Controller
public class CarsController {

    private final CarServiceImpl carServiceImpl;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count"
            , required = false, defaultValue = "5") Integer count, Model model) {
        model.addAttribute("car", carServiceImpl.getCountOfCar(count));
        return "cars";
    }
}
