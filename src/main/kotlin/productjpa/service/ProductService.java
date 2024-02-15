package productjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productjpa.ProductSummary;
import productjpa.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductSummary> getProductSummariesWithPriceLessThan50() {
        return productRepository.findByPriceLessThan(50.0);
    }
}

