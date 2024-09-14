package hu.unimiskolc.cars.service;

import hu.unimiskolc.cars.model.dto.CarDto;
import hu.unimiskolc.cars.model.entity.Car;
import hu.unimiskolc.cars.persist.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ManufacturerService manufacturerService;

    @Override
    public void createCar(CarDto carDto) {
        Car car = new Car();
        car.setName(carDto.getName());
        car.setColor(carDto.getColor());
        car.setManufacturer(manufacturerService.getManufacturer(carDto.getManufacturerId()));
        carRepository.save(car);
    }

    @Override
    public void deleteCar(long carId) {
        carRepository.deleteById(carId);
    }

    @Override
    public List<CarDto> listCars(long manufacturerId) {
        List<Car> cars = (List<Car>) carRepository.findAllByManufacturerId(manufacturerId);
        List<CarDto> carDtos = cars.stream().map(car -> {
            CarDto carDto = new CarDto();
            carDto.setName(car.getName());
            carDto.setColor(car.getColor());
            carDto.setManufacturerId(car.getManufacturer().getId());
            carDto.setId(car.getId());
            return carDto;
        }).toList();

        return carDtos;
    }
}
