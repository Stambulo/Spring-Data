package com.example.springdata;

import com.example.springdata.model.Product;
import com.example.springdata.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(ProductRepository productRepository) {
        return args -> {
            Product s1 = new Product();
            s1.setTitle("Orange");
            s1.setCompany("Thai-pokupai");
            s1.setCost(15);
            productRepository.save(s1);

            Product s2 = new Product();
            s2.setTitle("Mandarin");
            s2.setCompany("Turkey and Co");
            s2.setCost(11);
            productRepository.save(s2);

            Product s3 = new Product();
            s3.setTitle("Banana");
            s3.setCompany("Afrika plants ");
            s3.setCost(5);
            productRepository.save(s3);
        };
    }
}
