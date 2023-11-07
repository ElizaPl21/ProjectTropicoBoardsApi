package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
