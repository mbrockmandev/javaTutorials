package com.mbdev.carddatabase;

import com.mbdev.carddatabase.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
