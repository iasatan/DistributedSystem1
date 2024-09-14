package hu.unimiskolc.cars.controller;

import hu.unimiskolc.cars.model.entity.Manufacturer;
import hu.unimiskolc.cars.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufacturerController {
    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping("/manufacturers")
    public List<Manufacturer> GetAllManufacturers() {
        return manufacturerService.listManufacturers();
    }

    @PostMapping("/addManufacturer")
    public void CreateManufacturer(@RequestBody Manufacturer manufacturer) {
        manufacturerService.createManufacturer(manufacturer);
    }
}
