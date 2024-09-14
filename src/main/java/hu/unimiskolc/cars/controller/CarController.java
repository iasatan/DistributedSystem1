package hu.unimiskolc.cars.controller;

import hu.unimiskolc.cars.model.dto.CarDto;
import hu.unimiskolc.cars.model.entity.Car;
import hu.unimiskolc.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/createCar")
    public void createCar(@RequestBody CarDto car) {
        System.out.println(car);

        carService.createCar(car);
    }
    @GetMapping("/listCars")
    public List<CarDto> listCars(@RequestParam long manufacturerId) {
        return carService.listCars(manufacturerId);
    }
}
