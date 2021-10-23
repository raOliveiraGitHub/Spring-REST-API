package com.raoliveira.imechanicapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * raOliveira.pt | 16/10/2021
 * Computer Science and engineering
 **/

@Repository
public interface CarRepository extends JpaRepository<Cars, Integer> {

    // custom querys
    // get models by brand
    @Query("select c.model from Cars c where c.brand like %?1%")
    List<String> findByName(String brand);

    // get models by brand and fuel
    @Query("select c.model from Cars c where c.brand like %?1% AND c.engineFuel like %?2%")
    List<String> findByNameAndByFuel(String brand, String fuel);

    // get models by brand and fuel and year
    @Query("select c.model from Cars c where c.brand like %?1% AND c.engineFuel like %?2% AND c.year like %?3%")
    List<String> findByNameAndByFuelAndByYear(String brand, String fuel, String year);

}
