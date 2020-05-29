package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception {
        Category category = new Category();
        category.setName("sedan");
        categoryRepository.save(category);
        category = new Category();
        category.setName("van");
        categoryRepository.save(category);
        category = new Category();
        category.setName("truck");
        categoryRepository.save(category);
    }

}
