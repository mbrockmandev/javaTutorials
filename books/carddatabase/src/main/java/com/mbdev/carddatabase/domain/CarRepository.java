package com.mbdev.carddatabase.domain;

import com.mbdev.carddatabase.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
//  // get cars by color
//  List<Car> findByColor(String color);
//
//  // get cars by year
//  List<Car> findByYear(int year);
//
//  // get cars by brand and model
//  List<Car> findByBrandAndModel(String brand, String model);
//
//  // get cars by brand and sort by year
//  List<Car> findByBrandOrderByYearAsc(String brand);
//
//  // get cars by brand using SQL
//  @Query("select c from Car c where c.brand = ?1")
//  List<Car> findByBrand(String brand);
}

//public interface CarRepository extends PagingAndSortingRepository<Car, Long> { }