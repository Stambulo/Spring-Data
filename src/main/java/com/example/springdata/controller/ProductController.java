package com.example.springdata.controller;

import com.example.springdata.model.Product;
import com.example.springdata.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("product", productRepository.findAll());
        return "product";
    }

    @GetMapping("/{id}")
    public String deleteById(@PathVariable Integer id){
        productRepository.deleteById(id);
        return "redirect:/product";
    }

    @PostMapping
    public String create(@ModelAttribute("product")Product product){
        productRepository.save(product);
        return "redirect:/product";
    }
}
