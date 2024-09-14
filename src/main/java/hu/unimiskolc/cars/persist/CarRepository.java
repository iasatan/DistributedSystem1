package hu.unimiskolc.cars.persist;

import hu.unimiskolc.cars.model.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAllByManufacturerId(long manufacturerId);
}
