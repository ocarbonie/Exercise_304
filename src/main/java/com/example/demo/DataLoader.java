package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String...strings) throws Exception{
        Car course = new Car("Subaru", "Legacy", 2001);
        carRepository.save(course);

        course = new Car("Hyundai", "Sonata", 2011);
        carRepository.save(course);

        course = new Car("Honda", "Accord", 2001);
        carRepository.save(course);
    }

}
