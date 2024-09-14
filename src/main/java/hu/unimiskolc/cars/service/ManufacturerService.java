package hu.unimiskolc.cars.service;

import hu.unimiskolc.cars.model.entity.Manufacturer;

import java.util.List;

public interface ManufacturerService {
    void createManufacturer(Manufacturer manufacturer);
    void deleteManufacturer(Long manufacturerId);
    List<Manufacturer> listManufacturers();
    Manufacturer getManufacturer(Long manufacturerId);
}
