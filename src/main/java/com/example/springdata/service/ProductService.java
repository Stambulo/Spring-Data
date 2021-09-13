package com.example.springdata.service;

import com.example.springdata.dto.ProductDto;
import com.example.springdata.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> findAll(){
        return productRepository.findAll().stream()
                .map(ProductDto::valueOf)
                .collect(Collectors.toList());
    }

    public void save(ProductDto productDto) {
        productRepository.save(productDto.mapToProduct());
    }

    public void deleteById(Integer id){
        productRepository.deleteById(id);
    }
}
