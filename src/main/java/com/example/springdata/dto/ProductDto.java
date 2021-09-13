package com.example.springdata.dto;

import com.example.springdata.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Integer id;
    private String title;
    private String company;
    private Integer cost;

    public static ProductDto valueOf(Product product){
        return new ProductDto(
                product.getId(),
                product.getTitle(),
                product.getCompany(),
                product.getCost()
        );
    }

    public Product mapToProduct(){
        Product product = new Product();
        product.setId(id);
        product.setCost(cost);
        product.setTitle(title);
        product.setCompany(company);
        return product;
    }
}
