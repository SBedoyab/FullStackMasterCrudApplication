package com.fullstackmaster.controller;

import model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ProductoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductController {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getProduct(){
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto createProduct(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }
}
