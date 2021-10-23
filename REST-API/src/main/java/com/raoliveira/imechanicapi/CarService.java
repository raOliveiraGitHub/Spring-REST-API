package com.raoliveira.imechanicapi;

import java.util.List;
import java.util.Optional;

/**
 * raOliveira.pt | 16/10/2021
 * Computer Science Engineering
 **/

public interface CarService {

    List<Cars> findAll();

    Optional<Cars> findById(int id);

    void save(Cars car);

    void deleteById(int id);

}