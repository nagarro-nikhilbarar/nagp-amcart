package com.nagarro.amcart.search.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nagarro.amcart.models.product.Product;

@Repository
@Component("elasticsearchProductRepository")
public interface ElasticSearchProductRepository extends ElasticsearchRepository<Product, String> {	
	Page<Product> findByName(String name, Pageable pageable);
}