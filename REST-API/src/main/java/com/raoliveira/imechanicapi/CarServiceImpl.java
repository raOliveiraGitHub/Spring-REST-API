package com.raoliveira.imechanicapi;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * raOliveira.pt | 16/10/2021
 * Computer Science Engineering
 **/

@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Cars> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Cars> findById(int id) {
        return carRepository.findById(id);
    }

    @Override
    public void save(Cars car) {
        carRepository.save(car);
    }

    @Override
    public void deleteById(int id) {
        carRepository.deleteById(id);
    }

}