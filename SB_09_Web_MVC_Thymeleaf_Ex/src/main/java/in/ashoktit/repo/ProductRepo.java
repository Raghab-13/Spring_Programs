package in.ashoktit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashoktit.entity.Product;

public interface ProductRepo extends JpaRepository< Product , Integer>{

}
