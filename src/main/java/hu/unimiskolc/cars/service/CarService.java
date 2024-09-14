package hu.unimiskolc.cars.service;

import hu.unimiskolc.cars.model.dto.CarDto;
import hu.unimiskolc.cars.model.entity.Car;

import java.util.List;

public interface CarService {
    void createCar(CarDto carDto);
    void deleteCar(long carId);
    List<CarDto> listCars(long manufacturerId);
}
