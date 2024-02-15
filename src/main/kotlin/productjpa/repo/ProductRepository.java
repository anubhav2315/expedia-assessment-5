package productjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import productjpa.Product;
import productjpa.ProductSummary;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<ProductSummary> findByPriceLessThan(double price);
}
