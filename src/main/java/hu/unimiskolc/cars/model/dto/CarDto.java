package hu.unimiskolc.cars.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CarDto {
    private Long id;
    private String name;
    private String color;
    private Long manufacturerId;
}
