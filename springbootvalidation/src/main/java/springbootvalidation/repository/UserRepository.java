package springbootvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootvalidation.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
