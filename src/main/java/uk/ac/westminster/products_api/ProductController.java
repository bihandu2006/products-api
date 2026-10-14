package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController<ProductsService> {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id) {
        return new Products(id, "Laptop", 999.99);
    }

    @PostMapping
    public Products saveProduct(@RequestBody Products product) {
        System.out.println(product);
        return product;
    }
    @GetMapping("/products/search")
    public List<Products> search(@RequestParam String name) {
        return productService.findByName(name);



}}