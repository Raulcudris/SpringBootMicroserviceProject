package com.makiia.product_service.repository;
import com.makiia.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product,String> {

}
