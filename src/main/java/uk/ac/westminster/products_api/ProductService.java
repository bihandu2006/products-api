package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    @Service
    public class ProductService<Product> {

        private final List<Products> products = new ArrayList<>();
        private Long nextId = 1L;

        public List<Products> getProducts() {
            return products;
        }

        public Optional<Products> getProductById(Long id) {
            return products.stream()
                    .filter(p -> p.getId().equals(id))
                    .findFirst();
        }

        public Products addProduct(Products product) {
            product.setId(nextId);
            nextId++;
            products.add(product);
            return product;
        }

        public String deleteProductById(Long id) {
            boolean isDeleted = products.removeIf(
                    p -> p.getId().equals(id)
            );

            if (isDeleted) {
                return "Deleted!";
            } else {
                return "Product with ID " + id + " is not found";
            }
        }
        public List<Products>findByName(String name){
            return products.stream()
                    .filter(p -> p.getName().contains(name)).toList();
        }


    }
