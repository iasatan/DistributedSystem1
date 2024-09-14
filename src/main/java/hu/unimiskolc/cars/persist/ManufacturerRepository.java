package hu.unimiskolc.cars.persist;

import hu.unimiskolc.cars.model.entity.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
}
