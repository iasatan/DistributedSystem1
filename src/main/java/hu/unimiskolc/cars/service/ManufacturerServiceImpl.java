package hu.unimiskolc.cars.service;

import hu.unimiskolc.cars.model.entity.Manufacturer;
import hu.unimiskolc.cars.persist.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    private ManufacturerRepository manufacturerRepository;

    @Autowired
    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
        Manufacturer manufacturer = new Manufacturer(1l, "Toyota", LocalDate.now(),new ArrayList<>());
        createManufacturer(manufacturer);
    }


    @Override
    public void createManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Override
    public void deleteManufacturer(Long manufacturerId) {
        manufacturerRepository.deleteById(manufacturerId);
    }

    @Override
    public List<Manufacturer> listManufacturers() {
        List<Manufacturer> manufacturers = (List<Manufacturer>) manufacturerRepository.findAll();
        return manufacturers;
    }

    @Override
    public Manufacturer getManufacturer(Long manufacturerId) {
        return manufacturerRepository.findById(manufacturerId).get();
    }
}
