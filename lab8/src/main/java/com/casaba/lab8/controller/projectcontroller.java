package com.casaba.lab8;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    private final ProductService productService;

    public ProductQuery(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }
}
